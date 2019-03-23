package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarealabo3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText eTextUser, eTextPassword, eTextEmail, eTextGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.btn_send);
        eTextUser=findViewById(R.id.et_username);
       eTextPassword=findViewById(R.id.et_password);
        eTextEmail=findViewById(R.id.et_email);
        eTextGender=findViewById(R.id.et_gender);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
                mIntent.putExtra(AppConstants.TEXT_KEY, eTextUser.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY1, eTextPassword.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY2, eTextEmail.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY3, eTextGender.getText().toString());
                startActivity(mIntent);
            }
        });

    }
}
