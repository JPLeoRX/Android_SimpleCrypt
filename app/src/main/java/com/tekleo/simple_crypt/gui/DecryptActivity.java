package com.tekleo.simple_crypt.gui;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.tekleo.simple_crypt.R;
import com.tekleo.simple_crypt.gui.listeners.OnButtonDecrypt;

public class DecryptActivity extends CryptActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_decrypt);

        editText_Data = (EditText) findViewById(R.id.decrypt_editText_Data);
        editText_Password = (EditText) findViewById(R.id.decrypt_editText_Password);
        textView_Result = (TextView) findViewById(R.id.decrypt_textView_Result);
        button_Crypt = (ImageButton) findViewById(R.id.decrypt_button);
        progressBar = (ProgressBar) findViewById(R.id.decrypt_progressBar);

        button_Crypt.setOnClickListener(new OnButtonDecrypt(this));

        this.hideSoftKeyboard(button_Crypt);
        this.hideLoading();
    }
}
