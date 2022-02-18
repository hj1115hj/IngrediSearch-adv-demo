package com.demo.ingredisearch.features.favorites;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.test.espresso.contrib.RecyclerViewActions;

import com.demo.ingredisearch.BaseTest;
import com.demo.ingredisearch.R;

import org.junit.Test;

public class FavoritesFragmentTest extends BaseTest {

    @Test
    public void favoritesFragmentInView_withFavorites() {
        // Arrange (Given)
        /* TODO: prepare favorites source data */

        // Act (When)
        FragmentScenario.launchInContainer(FavoritesFragment.class, null, R.style.AppTheme);

        // Assert (Then)
        onView(withId(R.id.list)).check(matches(isDisplayed()));
    }

    @Test
    public void favoritesFragmentInView_withNoFavorites() {
        // Given

        // When
        FragmentScenario.launchInContainer(FavoritesFragment.class, null, R.style.AppTheme);

        // Then - No favorites yet
        checkEmptyFavoritesView();
    }

    private void checkEmptyFavoritesView() {
        onView(withId(R.id.noresultsContainer)).check(matches(isDisplayed()));
        onView(withId(R.id.noresultsTitle)).check(matches(isDisplayed()));
        onView(withText(R.string.nofavorites)).check(matches(isDisplayed()));
    }

    @Test
    public void selectRecipeAsNonFavorite_removesTheRecipeFromView() {
        // Arrange (Given)
        /* TODO: prepare favorites source data */

        // Act (When)
        /* TODO: Click the target R.id.favButton of an item view in recyclerview */

        // Assert (Then)
        /* TODO: Check the target an item view in recyclerview does not exit */
    }

    @Test
    public void selectLastRecipeAsNonFavorite_displaysNoFavorites() {
        // Arrange (Given)
        /* TODO: prepare favorites source data */

        // Act (When)
        /* TODO: Click the target R.id.favButton of an item view in recyclerview */

        // Assert (Then)
        checkEmptyFavoritesView();
    }

    @Test
    public void navigateToRecipeDetailsView() {
        // Arrange (Given)
        /* TODO: prepare favorites source data */

        NavHostController navHostController = mock(NavHostController.class);
        FragmentScenario<FavoritesFragment> scenario =
                FragmentScenario.launchInContainer(FavoritesFragment.class, null, R.style.AppTheme);
        scenario.onFragment(fragment -> Navigation.setViewNavController(fragment.requireView(), navHostController));

        // Act (When)
        onView(withId(R.id.list)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        // Assert (Then)
        verify(navHostController).navigate(
                FavoritesFragmentDirections.actionFavoritesFragmentToRecipeDetailsFragment(/* TODO: pass recipe id */null));
    }

}