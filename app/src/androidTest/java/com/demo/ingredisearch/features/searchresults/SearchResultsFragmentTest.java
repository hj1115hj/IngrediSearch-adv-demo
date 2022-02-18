package com.demo.ingredisearch.features.searchresults;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;

import com.demo.ingredisearch.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SearchResultsFragmentTest {

    @Before
    public void init() {
        /* TODO:
            1. Create fake data sources and repository
            2. Install repository to application.
         */
    }

    @After
    public void tearDown() {
        /* TODO: destory repository */
    }

    @Test
    public void SearchResultsFragmentInView() {
        // Arrange (Given)
        /* TODO: prepare remote data */

        // Act (When)
//        SearchResultsFragmentArgs args = new SearchResultsFragmentArgs.Builder("eggs").build();
        FragmentScenario.launchInContainer(SearchResultsFragment.class, /* TODO: pass query arg */ null, R.style.AppTheme);

        // Assert (Then)
        /* TODO: check R.id.list displayed */
    }

    @Test
    public void searchRecipes_queryWithNoResults_displayNoRecipesView() {
        // Arrange (Given)

        // Act (When)
        FragmentScenario.launchInContainer(SearchResultsFragment.class, /* TODO: pass query arg */ null, R.style.AppTheme);

        // Assert (Then)
        /* TODO: check R.id.noresultsContainer, R.id.noresultsTitle, R.string.noresults displayed */
    }

    @Test
    public void searchRecipes_errorOnConnection_displayRetryView() {
        // Arrange (Given)
        /* TODO: prepare remote source status */

        // Act (When)
        FragmentScenario.launchInContainer(SearchResultsFragment.class, /* TODO: pass query arg */ null, R.style.AppTheme);

        // Assert (Then)
        /* TODO: check R.id.errorContainer, R.id.retry, R.string.retry displayed */
    }

    @Test
    public void searchRecipes_errorOnConnection_displayRetryView_andThen_retry() {
        // Arrange (Given)
        /* TODO: prepare remote source data and set status as error */

        // Act (When)
        FragmentScenario.launchInContainer(SearchResultsFragment.class, /* TODO: pass query arg */ null, R.style.AppTheme);

        // Assert (Then)
        /* TODO: check R.id.errorContainer, R.id.retry, R.string.retry displayed */

        // Act (When)
        /* TODO: set remote source status as success and click R.id.retry view */

        // Assert (Then)
        onView(withId(R.id.list)).check(matches(isDisplayed()));
    }

    @Test
    public void selectRecipeAsFavorite_markItsStatusAsFavorite() throws Exception {
        // Given
        /* TODO: prepare remote data */

        // Act (When)
        /* TODO: Click the target R.id.favButton of an item view in recyclerview - how? */

        // Assert (Then)
        /* TODO: Check the target R.id.favButton status */
    }

    @Test
    public void selectRecipeAsUnFavorite_markItsStatusAsUnFavorite() throws Exception {
        // Given
        /* TODO: prepare remote data and favorite source data */

        // Act (When)
        /* TODO: Click the target R.id.favButton of an item view in recyclerview - how? */

        // Assert (Then)
        /* TODO: Check the target R.id.favButton status */
    }

    @Test
    public void navigateToRecipeDetailsView() {
        // Arrange (Given)
        /* TODO: prepare remote data */

        NavHostController navHostController = mock(NavHostController.class);
        FragmentScenario<SearchResultsFragment> scenario =
                FragmentScenario.launchInContainer(SearchResultsFragment.class, /* TODO: pass query arg */ null, R.style.AppTheme);
        scenario.onFragment(fragment -> Navigation.setViewNavController(fragment.requireView(), navHostController));

        // Act (When)
        onView(withId(R.id.list)).perform( /* TODO: */ null);

        // Assert (Then)
        verify(navHostController).navigate(
                SearchResultsFragmentDirections.actionSearchResultsFragmentToRecipeDetailsFragment(/* TODO: arg */ null));
    }
}