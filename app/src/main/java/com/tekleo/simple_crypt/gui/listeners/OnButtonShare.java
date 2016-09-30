package com.tekleo.simple_crypt.gui.listeners;

import android.view.View;

import com.tekleo.simple_crypt.gui.CryptActivity;
import com.tekleo.simple_crypt.gui.helpers.NavigationHelper;

/**
 * Listener to Share button
 * @author Leo Ertuna <leo.ertuna@gmail.com>
 */
public class OnButtonShare extends OnButtonCrypt
{
    /**
     * Constructor
     * @param cryptActivity parent activity
     */
    public OnButtonShare(CryptActivity cryptActivity) {
        super(cryptActivity);
    }

    /**
     * Response to clicks
     * @param v clicked view
     */
    @Override
    public void onClick(View v) {
        String message = cryptActivity.getTextView_Result().getText().toString();

        if (!message.equals(""))
            NavigationHelper.postToMedia(cryptActivity, message.trim());
    }
}