package nyc.c4q.midtermday2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        MainFragment mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, mainFragment);
        fragmentTransaction.commit();

        Intent intent = getIntent();
        String email = intent.getStringExtra("currentEmail");

        TextView textView = (TextView) findViewById(R.id.textInFrag);
        textView.setText(email);
    }
}
