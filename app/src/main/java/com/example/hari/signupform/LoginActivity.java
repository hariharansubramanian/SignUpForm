package com.example.hari.signupform;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;


public class LoginActivity extends ActionBarActivity {
    public static final String EXTRAKEY = "EXTRA";
    private static final String TAG = "MainActivity";
    EditText mUserNameInput;
    EditText mPasswordInput;
    EditText mConfirmPasswordInput;
    Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserNameInput = (EditText) findViewById(R.id.userNameField);
        mPasswordInput = (EditText) findViewById(R.id.passwordField);
        mConfirmPasswordInput = (EditText) findViewById(R.id.confirmpasswordField);
        mSubmit = (Button) findViewById(R.id.submit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserNameInput.getText().toString();
                String passWord = mPasswordInput.getText().toString();
                String confirmPassword = mConfirmPasswordInput.getText().toString();
                if (passWord.equals(confirmPassword)) {
                    Log.d(TAG, "Password is valid.. Creating new user");
                    User newUser = new User(userName, passWord);
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    i.putExtra(EXTRAKEY, newUser);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
