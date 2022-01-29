package com.demo.ingredisearch.features.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.repository.RecipeRepository;
import com.demo.ingredisearch.util.Event;

import java.util.List;

public class FavoritesViewModel extends ViewModel {
    private final RecipeRepository recipeRepository;

    public FavoritesViewModel(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
        load();
    }

    private final MutableLiveData<List<Recipe>> mFavorites = new MutableLiveData<>();

    public LiveData<List<Recipe>> getFavorites() {
        return mFavorites;
    }

    public void load() {
        mFavorites.setValue(recipeRepository.getFavorites());
    }

    public void removeFavorite(Recipe recipe) {
        recipeRepository.removeFavorite(recipe);
        load();
    }

    public void clearFavorites() {
        recipeRepository.clearFavorites();
        load();
    }

    private final MutableLiveData<Event<String>> mNavToRecipeDetails = new MutableLiveData<>();

    public LiveData<Event<String>> navToRecipeDetails() {
        return mNavToRecipeDetails;
    }

    public void requestToRecipeDetails(Recipe recipe) {
        // Do some business logic if necessary and then ...
        mNavToRecipeDetails.setValue(new Event<>(recipe.getRecipeId()));
    }
}
