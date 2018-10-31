package de.codinguniverse.counterexample.screens.counter;

import de.codinguniverse.counterexample.screens.common.views.ObservableViewMvc;
import de.codinguniverse.counterexample.screens.common.views.ViewMvc;

public interface CounterViewMvc extends ObservableViewMvc<CounterViewMvc.Listener> {
    interface Listener {
        void plusPressed();
        void minusPressed();
    }

    void updateCounterText(int counter);

}
