package com.tekleo.simple_crypt.gui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import com.tekleo.simple_crypt.R;
import com.tekleo.simple_crypt.gui.listeners.OnButtonSelectMode;

/**
 * Created by Leo on 04-Mar-16.
 */
public class MainActivity extends AppCompatActivity
{
    private ImageButton button_Encrypt;
    private ImageButton button_Decrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        button_Encrypt = (ImageButton) findViewById(R.id.main_button_Encrypt);
        button_Decrypt = (ImageButton) findViewById(R.id.main_button_Decrypt);

        button_Encrypt.setOnClickListener(new OnButtonSelectMode(this));
        button_Decrypt.setOnClickListener(new OnButtonSelectMode(this));
    }

    public ImageButton getButton_Encrypt() {
        return button_Encrypt;
    }

    public ImageButton getButton_Decrypt() {
        return button_Decrypt;
    }
}
