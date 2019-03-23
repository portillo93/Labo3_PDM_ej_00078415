package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarealabo3.utils.AppConstants;

public class NewActivity extends AppCompatActivity {
    private TextView mTextuser, mTextpassword, mTextemail, mTextgender;
    private Button mButtonShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mButtonShare=findViewById(R.id.btn_share);
        mTextuser=findViewById(R.id.tv_username);
        mTextpassword=findViewById(R.id.tv_password);
        mTextemail=findViewById(R.id.tv_email);
        mTextgender=findViewById(R.id.tv_gender);
        Intent mIntent = getIntent();
        mButtonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(AppConstants.TEXT_KEY, mTextuser.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY1, mTextpassword.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY2, mTextemail.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY3, mTextgender.getText().toString());
                startActivity(mIntent);
            }
        });
        if(mIntent!=null){
            mTextuser.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            mTextpassword.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY1));
            mTextemail.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY2));
            mTextgender.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY3));

        }
    }
}
