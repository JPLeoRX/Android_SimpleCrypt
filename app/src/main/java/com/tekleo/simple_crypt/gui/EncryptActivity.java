package com.tekleo.simple_crypt.gui;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.tekleo.simple_crypt.R;
import com.tekleo.simple_crypt.gui.listeners.OnButtonEncrypt;
import com.tekleo.simple_crypt.gui.listeners.OnButtonShare;

public class EncryptActivity extends CryptActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_encrypt);

        editText_Data = (EditText) findViewById(R.id.encrypt_editText_Data);
        editText_Password = (EditText) findViewById(R.id.encrypt_editText_Password);
        textView_Result = (TextView) findViewById(R.id.encrypt_textView_Result);
        button_Crypt = (ImageButton) findViewById(R.id.encrypt_button);
        button_Share = (ImageButton) findViewById(R.id.encrypt_button_Share);
        progressBar = (ProgressBar) findViewById(R.id.encrypt_progressBar);

        button_Crypt.setOnClickListener(new OnButtonEncrypt(this));
        button_Share.setOnClickListener(new OnButtonShare(this));

        this.hideSoftKeyboard(button_Crypt);
        this.hideLoading();
    }
}
