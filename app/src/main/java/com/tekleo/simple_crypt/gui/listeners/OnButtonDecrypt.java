package com.tekleo.simple_crypt.gui.listeners;

import android.view.View;

import com.tekleo.simple_crypt.gui.CryptActivity;
import com.tekleo.simple_crypt.gui.threads.DecryptThread;

/**
 * Listener to Decrypt button
 * @author Leo Ertuna <leo.ertuna@gmail.com>
 */
public class OnButtonDecrypt extends OnButtonCrypt
{
    /**
     * Constructor
     * @param cryptActivity parent activity
     */
    public OnButtonDecrypt(CryptActivity cryptActivity) {
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
            DecryptThread decryptThread = new DecryptThread(cryptActivity, data, pass);
            decryptThread.start();
        }
    }
}