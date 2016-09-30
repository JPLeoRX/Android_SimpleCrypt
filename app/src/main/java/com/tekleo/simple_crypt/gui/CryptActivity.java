package com.tekleo.simple_crypt.gui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CryptActivity extends AppCompatActivity {
    protected EditText editText_Data;
    protected EditText editText_Password;
    protected TextView textView_Result;
    protected ImageButton button_Crypt;
    protected ImageButton button_Share;
    protected ProgressBar progressBar;

    public EditText getEditText_Data() {
        return editText_Data;
    }

    public EditText getEditText_Password() {
        return editText_Password;
    }

    public TextView getTextView_Result() {
        return textView_Result;
    }

    public ImageButton getButton_Crypt() {
        return button_Crypt;
    }

    public ImageButton getButton_Share() {
        return button_Share;
    }

    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
        editText_Data.setEnabled(false);
        editText_Password.setEnabled(false);
        button_Crypt.setEnabled(false);
        if (button_Share != null)
            button_Share.setEnabled(false);
    }

    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
        editText_Data.setEnabled(true);
        editText_Password.setEnabled(true);
        button_Crypt.setEnabled(true);
        if (button_Share != null)
            button_Share.setEnabled(true);
    }

    /**
     * Hides keyboard and removes focus from EditText views
     * @param view reference view
     */
    public void hideSoftKeyboard (View view) {
        InputMethodManager imm = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);

        this.getEditText_Data().setFocusable(false);
        this.getEditText_Password().setFocusable(false);

        this.getEditText_Data().setFocusable(true);
        this.getEditText_Password().setFocusable(true);

        this.getEditText_Data().setFocusableInTouchMode(true);
        this.getEditText_Password().setFocusableInTouchMode(true);
    }
}
