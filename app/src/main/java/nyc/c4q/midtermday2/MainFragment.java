package nyc.c4q.midtermday2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.midtermday2.controller.NumberAdapter;
import nyc.c4q.midtermday2.model.NumberModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View rootView;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.textInFrag);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.fragRV);

        List<NumberModel> numbers = new ArrayList<>();
        numbers.add(new NumberModel(0));
        numbers.add(new NumberModel(1));
        numbers.add(new NumberModel(2));
        numbers.add(new NumberModel(3));
        numbers.add(new NumberModel(4));
        numbers.add(new NumberModel(5));
        numbers.add(new NumberModel(6));
        numbers.add(new NumberModel(7));
        numbers.add(new NumberModel(8));
        numbers.add(new NumberModel(9));
        numbers.add(new NumberModel(10));
        numbers.add(new NumberModel(11));

        NumberAdapter numberAdapter = new NumberAdapter(numbers);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(numberAdapter);

        MultiplyBy10Fragment nextFragment = new MultiplyBy10Fragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putString("number", null);
        //the number from the recyclerview should be in this bundle
        nextFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.fragmentContainer, nextFragment);
        fragmentTransaction.addToBackStack("next");
        fragmentTransaction.commit();

        return rootView;

    }

}
