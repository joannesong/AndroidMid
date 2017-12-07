package nyc.c4q.midtermday2.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.midtermday2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MultiplyBy10Fragment extends Fragment {


    public MultiplyBy10Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiply_by10, container, false);
    }

}
