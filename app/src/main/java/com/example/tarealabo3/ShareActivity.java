package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tarealabo3.utils.AppConstants;

public class ShareActivity extends AppCompatActivity {
    private TextView mTextuser, mTextpassword, mTextemail, mTextgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        mTextuser=findViewById(R.id.tv_share_username);
        mTextpassword=findViewById(R.id.tv_share_password);
        mTextemail=findViewById(R.id.tv_share_email);
        mTextgender=findViewById(R.id.tv_share_gender);
        Intent mIntent = getIntent();
        if(mIntent!=null){
            mTextuser.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            mTextpassword.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY1));
            mTextemail.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY2));
            mTextgender.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY3));

        }
    }
}
