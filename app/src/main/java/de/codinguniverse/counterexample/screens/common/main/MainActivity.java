package de.codinguniverse.counterexample.screens.common.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;

import de.codinguniverse.counterexample.R;
import de.codinguniverse.counterexample.screens.common.controllers.BaseActivity;
import de.codinguniverse.counterexample.screens.common.fragmentframehelper.FragmentFrameWrapper;
import de.codinguniverse.counterexample.screens.common.navigator.ScreensNavigator;

public class MainActivity extends BaseActivity implements FragmentFrameWrapper {

    private ScreensNavigator mScreensNavigator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_content_frame);

        mScreensNavigator = getCompositionRoot().getScreensNavigator();

        if (savedInstanceState == null) {
            mScreensNavigator.toCounter();
        }
    }

    @Override
    public FrameLayout getFragmentFrame() {
        return findViewById(R.id.frame_content);
    }
}
