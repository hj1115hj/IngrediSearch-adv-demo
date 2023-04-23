package com.demo.ingredisearch.ui;

import androidx.test.espresso.Espresso;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public void activityInView() {
        // Arrange (Given)
        // Act (When)
        /* TODO: Launch activity */

        // Assert (Then)
        /* TODO:
            check toolbar main title displayed
            check whether 'searchButton' view displayed
            check whether 'favButton' view displayed
         */

    }

    @Test
    public void testOpenDrawer() {
        // Arrange (Given)

        // Act (When)
        /* TODO: open drawer (drawer_layout) */
        openDrawer();

        // Assert (Then)
        /* TODO: check drawer Header and contents displayed */

    }

    @Test
    public void testCloseDrawer() {
        // Arrange (Given)
        openDrawer();

        // Act (When)
        closeDrawer();

        // Assert (Then)
        /* TODO: check both drawer Header and contents not displayed */

    }

    @Test
    public void navigateToHomeScreen() {
        // Arrange (Given)
        openDrawer();

        // Act (When)
        /* TODO: click on Home menu item */

        // Assert (Then)
        /* TODO: check whether `searchButton` and `favButton` is displayed */
    }

    @Test
    public void navigateToSearchScreen() {
        // Arrange (Given)
        openDrawer();

        // Act (When)
        /* TODO: click on Search menu item */

        // Assert (Then)
        /* TODO: check whether `R.string.search_title` text is displayed */

        /* TODO: check whether `R.string.search_header` text is displayed */

        /* TODO: check whether `R.id.ingredients` is displayed */

        /* TODO:  check whether `R.id.searchActionButton` is displayed */

    }

    @Test
    public void navigateToFavoriteScreen() {
        // Arrange (Given)
        openDrawer();

        // Act (When)
        /* TODO: click on "Favorites" menu item */

        // Assert (Then)
        /* TODO: check whether "Favorites" toolbar title is displayed */

    }

    @Test
    public void navigateToSearchScreen_and_backToHomeScreen() {
        // Arrange (Given)
        /* TODO: click on Search button */

        // Act (When)
        /* TODO: press on the back button or `navigateBack()` */

        // Assert (Then)
        /* TODO: check whether `R.id.searchButton` and `R.id.favButton` is displayed */

    }

    @Test
    public void navigateToSearchScreenToSearchResults_and_backToMainScreen() {
        // Arrange (Given)
        /* TODO: click on Search button */

        /* TODO: enter query and press `R.id.searchActionButton` */

        // Act (When)
        /* TODO: press back button twice */

        // Assert (Then)
        /* TODO: check whether main screen in view */

    }

    @Test
    public void navigateToSearchScreenToSearchResultsToRecipeDetails_and_backToMainScreen() {
        // Arrange (Given)
        /* TODO: prepare fake remote data source */

        /* TODO: click on Search button */

        /* TODO: enter query and press `R.id.searchActionButton` */

        /* TODO: select a recipe */

        // Act (When)
        // press back button three times
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();

        // Assert (Then)
        /* TODO: check whether main screen in view */
    }

    private void openDrawer() {
        /* TODO: `R.id.drawer_layout`, Use DrawerMatchers and DrawerActions */

    }

    private void closeDrawer() {
        /* TODO */

    }

    private void navigateBack() {
        /* TODO: contentDescription "Navigate up" or `R.string.abc_action_bar_up_description` */
    }

//    private String getToolbarNavigationContentDescription() {
//        String[] contentDescription = new String[1];
//        rule.getScenario().onActivity(
//                activity -> {
//                    contentDescription[0] = Objects.requireNonNull(((Toolbar) activity.findViewById(R.id.toolbar)).getNavigationContentDescription()).toString();
//                }
//        );
//        return contentDescription[0];
//    }
}
