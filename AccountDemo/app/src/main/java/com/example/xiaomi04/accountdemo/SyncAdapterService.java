package com.example.xiaomi04.accountdemo;

import android.accounts.Account;
import android.app.Service;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;

/**
 * Created by xiaomi04 on 17-7-15.
 */
public class SyncAdapterService extends Service {

    protected SyncAdapter syncAdapter() {
        return new SyncAdapter(this) {
            @Override
            public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {

            }
        };
    }

    @Override
    public IBinder onBind(Intent intent) {
        return syncAdapter().getSyncAdapterBinder();
    }

    public static abstract class SyncAdapter extends
            AbstractThreadedSyncAdapter {

        public SyncAdapter(Context context) {
            super(context, false);
        }

        @Override
        public void onPerformSync(Account account, Bundle extras,
                                  String authority, ContentProviderClient provider,
                                  SyncResult syncResult) {
            // required for dav4android (ServiceLoader)
            Thread.currentThread().setContextClassLoader(getContext().getClassLoader());
        }
    }
}
