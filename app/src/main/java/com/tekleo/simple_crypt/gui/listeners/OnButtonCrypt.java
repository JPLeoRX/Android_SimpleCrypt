package com.tekleo.simple_crypt.gui.listeners;

import android.view.View;

import com.tekleo.simple_crypt.gui.CryptActivity;

/**
 * Abstract listener that receives the parent activity
 * Use only for buttons in Crypt Activity
 * @author Leo Ertuna <leo.ertuna@gmail.com>
 */
public abstract class OnButtonCrypt implements View.OnClickListener
{
    protected CryptActivity cryptActivity;

    /**
     * Constructor
     * @param cryptActivity parent activity
     */
    public OnButtonCrypt(CryptActivity cryptActivity) {
        this.cryptActivity = cryptActivity;
    }
}