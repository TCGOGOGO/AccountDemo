package com.example.xiaomi04.accountdemo;

import android.accounts.*;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.AbstractMap;

/**
 * Created by xiaomi04 on 17-7-15.
 */
public class AccountDemoAuthenticator extends AbstractAccountAuthenticator {

    private final Context mContext;

    public AccountDemoAuthenticator(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String s) {
        return null;
    }

    @Override
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String s, String s1, String[] strings, Bundle bundle) throws NetworkErrorException {
        Bundle myBundle = new Bundle();
        Intent intent = new Intent();
        myBundle.putParcelable(AccountManager.KEY_INTENT, intent);
        return myBundle;
        //return null;
    }

    @Override
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String s, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override
    public String getAuthTokenLabel(String s) {
        return null;
    }

    @Override
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String s, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strings) throws NetworkErrorException {
        return null;
    }
}
