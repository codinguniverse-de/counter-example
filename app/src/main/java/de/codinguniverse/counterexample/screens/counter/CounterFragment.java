package de.codinguniverse.counterexample.screens.counter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.codinguniverse.counterexample.screens.common.controllers.BaseFragment;

public class CounterFragment extends BaseFragment implements CounterViewMvc.Listener {

    private int mCounter = 0;
    private CounterViewMvc mViewMvc;

    public static Fragment newInstance() {
        return new CounterFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewMvc = getCompositionRoot().getViewMvcFactory().getCounterViewMvc(container);
        return mViewMvc.getRootView();
    }

    @Override
    public void onStart() {
        super.onStart();
        mViewMvc.registerListener(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        mViewMvc.unregisterListener(this);
    }

    @Override
    public void plusPressed() {
        mCounter++;
        updateCounter();
    }

    @Override
    public void minusPressed() {
        mCounter--;
        updateCounter();
    }

    private void updateCounter() {
        mViewMvc.updateCounterText(mCounter);
    }
}
