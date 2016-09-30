package com.tekleo.simple_crypt.gui.listeners;

import android.view.View;

import com.tekleo.simple_crypt.gui.CryptActivity;
import com.tekleo.simple_crypt.gui.threads.EncryptThread;

/**
 * Listener to Encrypt button
 * @author Leo Ertuna <leo.ertuna@gmail.com>
 */
public class OnButtonEncrypt extends OnButtonCrypt
{
    /**
     * Constructor
     * @param cryptActivity parent activity
     */
    public OnButtonEncrypt(CryptActivity cryptActivity) {
        super(cryptActivity);
    }

    /**
     * Response to clicks
     * @param v clicked view
     */
    @Override
    public void onClick(View v) {
        cryptActivity.hideSoftKeyboard(v);
        String data = cryptActivity.getEditText_Data().getText().toString();
        String pass = cryptActivity.getEditText_Password().getText().toString();

        if (!(data.equals("") || pass.equals("")))
        {
            cryptActivity.showLoading();
            EncryptThread encryptThread = new EncryptThread(cryptActivity, data, pass);
            encryptThread.start();
        }
    }
}