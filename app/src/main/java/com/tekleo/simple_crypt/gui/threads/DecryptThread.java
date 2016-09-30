package com.tekleo.simple_crypt.gui.threads;

import com.tekleo.simple_crypt.crypt.wrappers.AES_Wrappers;
import com.tekleo.simple_crypt.gui.CryptActivity;

public class DecryptThread extends CryptThread
{
    public DecryptThread(CryptActivity cryptActivity, String data, String pass) {
        super(cryptActivity, data, pass);
    }

    @Override
    public void cryptAction() {
        result = AES_Wrappers.decrypt(data, pass);

        if (result == null || result.equals(""))
            result = "Invalid password";
    }

    @Override
    public void uiAction() {
        cryptActivity.hideLoading();
        cryptActivity.getTextView_Result().setText(result);
    }
}