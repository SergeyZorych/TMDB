package com.sergey_zorych.tmdb.navigation.base

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.*
import androidx.navigation.fragment.findNavController
import com.sergey_zorych.tmdb.navigation.R

/**
 * Created by Android Studio on 7/20/21 2:42 PM
 *
 * Base class for every fragment, that contains navigation builder
 *
 * @author Sergey Zorych
 */
abstract class BaseRouter(
    val fragment: Fragment
) {

    protected open val navController: NavController = fragment.findNavController()

    /**
     * Pop to previous fragment in back stack
     */
    open fun back() {
        navController.popBackStack()
    }

    /**
     * Pop to specific direction in back stack
     * @param to the topmost destination to retain
     * @param inclusive whether the given destination should also be popped.
     */
    open fun back(@IdRes to: Int, inclusive: Boolean = false) {
        navController.popBackStack(to, inclusive)
    }

    /**
     * Build and execute navigation
     */
    fun navigate(builder: NavigationBuilder.() -> Unit) {
        val navigation = NavigationBuilder().apply(builder)

        navController.navigate(navigation.request!!, navigation.options, navigation.extras)
    }
}

class NavigationBuilder {

    /**
     * Navigate direction
     */
    var request: NavDeepLinkRequest? = null

    /**
     * Animation between destinations
     */
    var animation: NavAnimation = NavAnimation.SLIDE_RIGHT_TO_LEFT

    /**
     * Whether the `popUpTo` destination should be popped from the back stack
     */
    var inclusive: Boolean? = null

    /**
     * Pop up to a given destination before navigating
     */
    @IdRes
    var popUpTo: Int? = null

    /**
     * Extras to pass to the Navigator
     */
    var extras: Navigator.Extras? = null

    /**
     * Special options for this navigation operation
     */
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

    /**
     * Represents possible animations between directions
     */
    enum class NavAnimation {
        SLIDE_BOTTOM_TO_TOP,
        SLIDE_RIGHT_TO_LEFT
    }
}