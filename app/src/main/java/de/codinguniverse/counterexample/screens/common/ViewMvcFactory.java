package de.codinguniverse.counterexample.screens.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import de.codinguniverse.counterexample.screens.counter.CounterViewMvc;
import de.codinguniverse.counterexample.screens.counter.CounterViewMvcImpl;

public class ViewMvcFactory {

    private final LayoutInflater mLayoutInflater;

    public ViewMvcFactory(LayoutInflater layoutInflater) {
        mLayoutInflater = layoutInflater;
    }


    public CounterViewMvc getCounterViewMvc(ViewGroup container) {
        return new CounterViewMvcImpl(mLayoutInflater, container);
    }
}
