package nyc.c4q.midtermday2.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.midtermday2.R;
import nyc.c4q.midtermday2.model.NumberModel;
import nyc.c4q.midtermday2.view.NumberViewHolder;

/**
 * Created by joannesong on 12/6/17.
 */

public class NumberAdapter extends RecyclerView.Adapter<NumberViewHolder>{

    private List<NumberModel>  numberList;

    public NumberAdapter(List<NumberModel> numberList) {
        this.numberList = numberList;
    }

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_rv, parent,false);
        return new NumberViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        NumberModel numberModel = numberList.get(position);
        holder.onBind(numberModel);

    }

    @Override
    public int getItemCount() {
        return numberList.size();
    }
}
