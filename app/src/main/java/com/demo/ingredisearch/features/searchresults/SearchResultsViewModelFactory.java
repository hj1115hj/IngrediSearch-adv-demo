package com.demo.ingredisearch.features.searchresults;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class SearchResultsViewModelFactory implements ViewModelProvider.Factory {

    /* TODO */

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (!modelClass.isAssignableFrom(SearchResultsViewModel.class))
            throw new IllegalArgumentException("No such viewmodel exists");

        return (T) new SearchResultsViewModel(/* TODO */);
    }
}
