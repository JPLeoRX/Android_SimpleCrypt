package com.tekleo.simple_crypt.gui.threads;

import com.tekleo.simple_crypt.crypt.wrappers.AES_Wrappers;
import com.tekleo.simple_crypt.gui.CryptActivity;

public class EncryptThread extends CryptThread
{
    public EncryptThread(CryptActivity cryptActivity, String data, String pass) {
        super(cryptActivity, data, pass);
    }

    @Override
    public void cryptAction() {
        result = AES_Wrappers.encrypt_256(data, pass);
    }

    @Override
    public void uiAction() {
        cryptActivity.hideLoading();
        cryptActivity.getTextView_Result().setText(result);
    }
}
