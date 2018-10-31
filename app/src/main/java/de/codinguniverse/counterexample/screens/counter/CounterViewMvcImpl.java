package de.codinguniverse.counterexample.screens.counter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.codinguniverse.counterexample.R;
import de.codinguniverse.counterexample.screens.common.views.BaseObservableViewMvc;

public class CounterViewMvcImpl extends BaseObservableViewMvc<CounterViewMvc.Listener>
        implements CounterViewMvc {

    private final TextView mTxtCounter;

    public CounterViewMvcImpl(LayoutInflater inflater, ViewGroup container) {
        setRootView(inflater.inflate(R.layout.layout_counter, container, false));

        mTxtCounter = findViewById(R.id.counter_text);
        Button mBtnPlus = findViewById(R.id.plus_button);
        Button mBtnMinus = findViewById(R.id.minus_button);

        mBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Listener listener : getListeners()) {
                    listener.minusPressed();
                }
            }
        });

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Listener listener : getListeners()) {
                    listener.plusPressed();
                }
            }
        });
    }

    @Override
    public void updateCounterText(int counter) {
        mTxtCounter.setText(Integer.toString(counter));
    }
}
