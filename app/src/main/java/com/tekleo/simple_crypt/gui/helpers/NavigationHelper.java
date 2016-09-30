package com.tekleo.simple_crypt.gui.helpers;

import android.app.Activity;
import android.content.Intent;

import com.tekleo.simple_crypt.gui.DecryptActivity;
import com.tekleo.simple_crypt.gui.EncryptActivity;

/**
 * Helper for navigation between activities
 * Wrap all intent handling in here
 * @author Leo Ertuna <leo.ertuna@gmail.com>
 */
public class NavigationHelper
{
    /**
     * Start Encrypt Activity
     * @param activity current activity
     */
    public static void goToEncryptActivity(Activity activity) {
        Intent k = new Intent(activity, EncryptActivity.class);
        activity.startActivity(k);
    }

    /**
     * Start Decrypt Activity
     * @param activity current activity
     */
    public static void goToDecryptActivity(Activity activity) {
        Intent k = new Intent(activity, DecryptActivity.class);
        activity.startActivity(k);
    }

    /**
     * Send a message to other apps
     * @param activity current activity
     * @param message message to send
     */
    public static void postToMedia(Activity activity, String message) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");
        activity.startActivity(sendIntent);
    }
}
