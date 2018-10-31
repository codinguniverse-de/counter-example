package de.codinguniverse.counterexample.screens.common.navigator;

import de.codinguniverse.counterexample.screens.common.fragmentframehelper.FragmentFrameHelper;
import de.codinguniverse.counterexample.screens.counter.CounterFragment;

public class ScreensNavigator {
    private FragmentFrameHelper mFragmentFrameHelper;

    public ScreensNavigator(FragmentFrameHelper fragmentFrameHelper) {
        this.mFragmentFrameHelper = fragmentFrameHelper;
    }

    public void toCounter() {
        mFragmentFrameHelper.replaceFragment(CounterFragment.newInstance());
    }
}
