package com.demo.ingredisearch.features.favorites;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import com.demo.ingredisearch.TestData;
import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.util.Event;
import com.demo.ingredisearch.util.LiveDataTestUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

public class FavoritesViewModelTest {

    @Rule
    public InstantTaskExecutorRule rule = new InstantTaskExecutorRule();

    // SUT
    FavoritesViewModel mViewModel;

    // TODO

    @Before
    public void init() {
        // TODO
        mViewModel = new FavoritesViewModel(null);
    }

    @After
    public void tearDown() {
        // TODO
    }

    @Test
    public void getFavorites_returnFavoriteRecipes() throws Exception {
        // Arrange (Given)
//        mFavoritesSource.addFavorites(TestData.mFavorites);

        // Act (When)
        List<Recipe> favorites = LiveDataTestUtil.getOrAwaitValue(mViewModel.getFavorites());

        // Assert (Then)
        assertThat(favorites, is(TestData.mFavorites));
    }

    @Test
    public void removeFavorite_shouldRemoveFavorite() throws Exception {
        // Arrange (Given)
//        mFavoritesSource.addFavorites(TestData.mFavorites);

        // Act (When)
        mViewModel.removeFavorite(TestData.recipe1_favored);

        // Assert (Then)
        List<Recipe> favorites = LiveDataTestUtil.getOrAwaitValue(mViewModel.getFavorites());
        assertThat(favorites, is(List.of(TestData.recipe2_favored)));
    }

    @Test
    public void clearFavorites_shouldResetFavoritesToEmpty() throws Exception {
        // Arrange (Given)
//        mFavoritesSource.addFavorites(TestData.mFavorites);

        // Act (When)
        mViewModel.clearFavorites();

        // Assert (Then)
        List<Recipe> favorites = LiveDataTestUtil.getOrAwaitValue(mViewModel.getFavorites());
        assertThat(favorites.size(), is(0));
    }

    @Test
    public void requestToRecipeDetails_shouldTriggerNavToRecipeDetails() throws Exception {
        // Arrange (Given)
//        mFavoritesSource.addFavorites(TestData.mFavorites);

        // Act (When)
        mViewModel.requestToRecipeDetails(TestData.recipe1_favored);

        // Assert (Then)
        Event<String> event = LiveDataTestUtil.getOrAwaitValue(mViewModel.navToRecipeDetails());
        assertThat(event.getContentIfNotHandled(), is(TestData.recipe1.getRecipeId()));
    }

}
