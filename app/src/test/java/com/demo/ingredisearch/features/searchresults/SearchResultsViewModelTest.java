package com.demo.ingredisearch.features.searchresults;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import com.demo.ingredisearch.repository.RecipeRepository;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class SearchResultsViewModelTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    // SUT
    SearchResultsViewModel mViewModel;

    RecipeRepository mRecipeRepository;

    @Before
    public void init() {
        mViewModel = new SearchResultsViewModel(mRecipeRepository);
    }

    @After
    public void tearDown() {
//        mRecipeRepository.destroy();
    }

    @Test
    public void searchRecipes_allNonFavorites_displayRecipesAsTheyAre() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void searchRecipes_emptyRecipes_displayNoRecipes() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void searchRecipes_networkError_displayRetry() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void searchRecipes_withSomeFavorites_displayRecipesAsDecorated() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void markFavorite_reloadUpdatedRecipes() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void unMarkFavorite_reloadUpdatedRecipes() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void requestToRecipeDetails_shouldTriggerNavToRecipeDetails() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

}
