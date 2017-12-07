package nyc.c4q.midtermday2;


import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.view.menu.MenuView;
import android.widget.TextView;


/**
 * Created by joannesong on 12/6/17.
 */


class AddingAsyncTask extends AsyncTask<Integer, Integer, Integer> {
    Context context;
    private int x = 0;

    public AddingAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(Integer... integers) {

        for (int i = 0; i <100000 ; i++) {
            publishProgress(i);
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);

    }

    Intent intent = new Intent(context, LoginActivity.this);
        context.startActivity(intent);

}
