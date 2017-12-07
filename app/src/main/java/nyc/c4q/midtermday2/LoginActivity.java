package nyc.c4q.midtermday2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private EditText email;
    private EditText password;
    private CheckBox checkBox;
    private Button button;
    private SharedPreferences login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.edit1);
        password = (EditText) findViewById(R.id.edit2);
        checkBox = (CheckBox) findViewById(R.id.remember_me_checkbox);
        button = (Button) findViewById(R.id.button);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        if(login.getBoolean("isChecked", false)){
            email.setText(login.getString("email",null ));
            password.setText(login.getString("password", null));
            checkBox.setChecked(login.getBoolean("isChecked", false));

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = login.edit();
                if (checkBox.isChecked()) {
                    editor.putString("email", email.getText().toString());
                    editor.putString("password", password.getText().toString());
                    editor.putBoolean("isChecked", checkBox.isChecked());
                    editor.commit();

                    Toast.makeText(getApplicationContext(), "here1", Toast.LENGTH_SHORT).show();

                } else {
                    editor.putBoolean("isChecked", checkBox.isChecked());
                    editor.commit();

                    Toast.makeText(getApplicationContext(), "here2", Toast.LENGTH_SHORT).show();
                }

                if (email.getText().toString().equalsIgnoreCase("user@aol.com")
                        && password.getText().toString().equals("password1234")) {

                    Intent intent = new Intent(LoginActivity.this, ListActivity.class);
                    intent.putExtra("currentEmail", email.getText().toString());
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "here3", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}



















