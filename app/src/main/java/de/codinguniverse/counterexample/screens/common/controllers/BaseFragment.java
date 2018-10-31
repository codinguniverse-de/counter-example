package de.codinguniverse.counterexample.screens.common.controllers;

import android.support.v4.app.Fragment;

import de.codinguniverse.counterexample.common.CustomApplication;
import de.codinguniverse.counterexample.common.di.ControllerCompositionRoot;

public class BaseFragment extends Fragment {

    private ControllerCompositionRoot mControllerCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication) getActivity().getApplication()).getCompositionRoot(),
                    getActivity()
            );
        }
        return mControllerCompositionRoot;
    }
}
