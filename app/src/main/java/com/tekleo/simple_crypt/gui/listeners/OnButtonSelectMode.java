package com.tekleo.simple_crypt.gui.listeners;

import android.view.View;

import com.tekleo.simple_crypt.gui.MainActivity;
import com.tekleo.simple_crypt.gui.helpers.NavigationHelper;

/**
 * Listener to mode buttons in Main Activity
 * @author Leo Ertuna <leo.ertuna@gmail.com>
 */
public class OnButtonSelectMode implements View.OnClickListener
{
    private MainActivity mainActivity;

    /**
     * Constructor
     * @param mainActivity parent activity
     */
    public OnButtonSelectMode(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    /**
     * Response to clicks
     * @param v clicked view
     */
    @Override
    public void onClick(View v) {
        if (v == mainActivity.getButton_Encrypt())
            NavigationHelper.goToEncryptActivity(mainActivity);
        else if (v == mainActivity.getButton_Decrypt())
            NavigationHelper.goToDecryptActivity(mainActivity);
    }
}