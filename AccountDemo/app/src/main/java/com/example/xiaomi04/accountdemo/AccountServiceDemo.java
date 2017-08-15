package com.example.xiaomi04.accountdemo;

import android.accounts.AccountManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by xiaomi04 on 17-7-15.
 */
public class AccountServiceDemo extends Service {

    private AccountDemoAuthenticator authenticator = null;

    @Override
    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals(AccountManager.ACTION_AUTHENTICATOR_INTENT)) {
             return getAuthenticator().getIBinder();
        }
        return null;
    }


    private AccountDemoAuthenticator getAuthenticator() {
        if (authenticator == null) {
            authenticator = new AccountDemoAuthenticator(this);
        }
        return authenticator;
    }
}
