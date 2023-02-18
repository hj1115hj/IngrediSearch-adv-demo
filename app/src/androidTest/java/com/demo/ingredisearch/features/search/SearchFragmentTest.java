package com.demo.ingredisearch.features.search;

import org.junit.Test;

public class SearchFragmentTest {

    @Test
    public void searchFragmentInView() throws Exception {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    /*
     * Mock, Navigation.setViewNavController, and FragmentScenario are used to test navigation.
     * or
     * TestNavHostController and runOnUiThread are used to test navigation.
     */
    @Test
    public void search_validQuery_navigateToSearchResultsView() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void search_emptyQuery_displayWarningSnackBar() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
        /* TODO: check snackbar is displayed: R.string.search_query_required
           and/or com.google.android.material.R.id.snackbar_text */
    }

    /*
     * TODO: Rotate screen - UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
     */
    @Test
    public void search_emptyQuery_displayWarningSnackBar_shouldNotDisplayAgain_whenRotated() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
        /* TODO: check snackbar is displayed */

        // Act (When)
        /* TODO: Rotate screen - UiDevice.getInstrumentation(...)

        // Assert (Then)
        /* TODO: check snackbar does not exist */
    }
}