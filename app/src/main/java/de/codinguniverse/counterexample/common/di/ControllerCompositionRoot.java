package de.codinguniverse.counterexample.common.di;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;

import de.codinguniverse.counterexample.screens.common.ViewMvcFactory;
import de.codinguniverse.counterexample.screens.common.fragmentframehelper.FragmentFrameHelper;
import de.codinguniverse.counterexample.screens.common.fragmentframehelper.FragmentFrameWrapper;
import de.codinguniverse.counterexample.screens.common.navigator.ScreensNavigator;

public class ControllerCompositionRoot {
    private final FragmentActivity mActivity;
    private final CompositionRoot mCompositionRoot;

    public ControllerCompositionRoot(CompositionRoot compositionRoot, FragmentActivity activity) {
        this.mActivity = activity;
        this.mCompositionRoot = compositionRoot;
    }

    private FragmentActivity getActivity() {
        return mActivity;
    }

    private Context getContext() {
        return mActivity;
    }

    private FragmentManager getFragmentManager() {
        return getActivity().getSupportFragmentManager();
    }

    private LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(getContext());
    }

    public ViewMvcFactory getViewMvcFactory() {
        return new ViewMvcFactory(getLayoutInflater());
    }

    private FragmentFrameHelper getFragmentFrameHelper() {
        return new FragmentFrameHelper(getActivity(), getFragmentFrameWrapper(), getFragmentManager());
    }

    private FragmentFrameWrapper getFragmentFrameWrapper() {
        return (FragmentFrameWrapper) getActivity();
    }


    public ScreensNavigator getScreensNavigator() {
        return new ScreensNavigator(getFragmentFrameHelper());
    }

}
