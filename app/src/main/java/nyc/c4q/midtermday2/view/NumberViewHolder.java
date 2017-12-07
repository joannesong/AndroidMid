package nyc.c4q.midtermday2.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.midtermday2.R;
import nyc.c4q.midtermday2.model.NumberModel;

/**
 * Created by joannesong on 12/6/17.
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    private TextView number;

    public NumberViewHolder(View itemView) {
        super(itemView);
        number = (TextView) itemView.findViewById(R.id.numForRV);
    }

    public void onBind(NumberModel numberModel){
        number.setText(numberModel.getNum() + "");
    }
}
