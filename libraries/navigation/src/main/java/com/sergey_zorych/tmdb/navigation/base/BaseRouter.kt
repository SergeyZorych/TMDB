package com.sergey_zorych.tmdb.navigation.base

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.*
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController
import com.sergey_zorych.tmdb.navigation.R

/**
 * Created by Android Studio on 7/20/21 2:42 PM
 *
 * @author Sergey Zorych
 */
abstract class BaseRouter(
    val fragment: Fragment
) {

    protected open val navController: NavController = fragment.findNavController()

    open fun back() {
        navController.popBackStack()
    }

    open fun back(@IdRes to: Int, inclusive: Boolean = false) {
        navController.popBackStack(to, inclusive)
    }

    private fun isCurrentScreen(): Boolean {
        return (navController.currentDestination as? FragmentNavigator.Destination)?.className == fragment.javaClass.name
    }


    fun navigate(builder: NavigationBuilder.() -> Unit) {
        val navigation = NavigationBuilder().apply(builder)

        navController.navigate(navigation.request!!, navigation.options, navigation.extras)
    }
}

class NavigationBuilder {

    var request: NavDeepLinkRequest? = null

    var animation: NavAnimation = NavAnimation.SLIDE_RIGHT_TO_LEFT

    var inclusive: Boolean? = null

    @IdRes
    var popUpTo: Int? = null

    var extras: Navigator.Extras? = null

    val options: NavOptions
        get() = navOptions {
            when (animation) {
                NavAnimation.SLIDE_BOTTOM_TO_TOP ->
                    anim {
                        enter = R.anim.enter_from_bottom
                        popExit = R.anim.exit_to_bottom
                    }

                NavAnimation.SLIDE_RIGHT_TO_LEFT ->
                    anim {
                        enter = R.anim.enter_from_left
                        exit = R.anim.exit_to_right
                        popEnter = R.anim.enter_from_right
                        popExit = R.anim.exit_to_left
                    }
            }

            if (this@NavigationBuilder.popUpTo != null && this@NavigationBuilder.inclusive != null) {
                popUpTo(this@NavigationBuilder.popUpTo!!) {
                    this.inclusive = this@NavigationBuilder.inclusive!!
                }
            }
        }

    enum class NavAnimation {
        SLIDE_BOTTOM_TO_TOP,
        SLIDE_RIGHT_TO_LEFT
    }
}