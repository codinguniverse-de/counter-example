package de.codinguniverse.counterexample.screens.common.fragmentframehelper;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

public interface HierarchicalFragment {
    @Nullable
    Fragment getHierarchicalParentFragment();
}
