package de.codinguniverse.counterexample.screens.common.controllers;

import android.support.v7.app.AppCompatActivity;

import de.codinguniverse.counterexample.common.CustomApplication;
import de.codinguniverse.counterexample.common.di.ControllerCompositionRoot;

public class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot mControllerCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication) getApplication()).getCompositionRoot(),
                    this
            );
        }
        return mControllerCompositionRoot;
    }


}

