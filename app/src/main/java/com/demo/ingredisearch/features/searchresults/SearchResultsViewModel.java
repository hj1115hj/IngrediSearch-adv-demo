package com.demo.ingredisearch.features.searchresults;

import androidx.lifecycle.ViewModel;

import com.demo.ingredisearch.repository.RecipeRepository;

public class SearchResultsViewModel extends ViewModel {

    private final RecipeRepository mRecipeRepository;
    public SearchResultsViewModel(RecipeRepository recipeRepository) {
        this.mRecipeRepository = recipeRepository;
    }

}
