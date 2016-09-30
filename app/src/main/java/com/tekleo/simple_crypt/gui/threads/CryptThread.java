package com.tekleo.simple_crypt.gui.threads;

import com.tekleo.simple_crypt.gui.CryptActivity;

public abstract class CryptThread extends Thread
{
    protected CryptActivity cryptActivity;                          // Activity
    protected String data;                                          // Data for encryption/decryption
    protected String pass;                                          // Password
    protected String result;                                        // Result of encryption/decryption

    //----------------------------------------------------------------------------------------------
    //---------------------------------- Thread methods --------------------------------------------
    //----------------------------------------------------------------------------------------------
    /**
     * Constructor
     * @param cryptActivity
     * @param data
     * @param pass
     */
    public CryptThread(CryptActivity cryptActivity, String data, String pass) {
        this.cryptActivity = cryptActivity;
        this.data = data;
        this.pass = pass;
    }

    /**
     * Perform encryption/decryption tasks here
     */
    public abstract void cryptAction();

    /**
     * Perform UI update tasks here
     */
    public abstract void uiAction();
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------



    //----------------------------------------------------------------------------------------------
    //----------------------------------- Thread core ----------------------------------------------
    //----------------------------------------------------------------------------------------------
    /**
     * Thread run method
     */
    @Override
    public void run() {
        super.run();                                                // Super call
        this.cryptAction();                                         // Run encryption/decryption task
        this.cryptActivity.runOnUiThread(new RunnableUI());         // Run UI update tasks
    }

    /**
     * Runnable object for UI tasks
     */
    private class RunnableUI implements Runnable {
        @Override
        public void run() {
            uiAction();
        }
    }
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------
}