package com.edgarmarcopolo.notificationexample;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

/**
 * Created by EdgarGalvan on 2/7/2017.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate(){
        FirebaseMessaging.getInstance().subscribeToTopic("android");
        FirebaseMessaging.getInstance().subscribeToTopic("nodejs");
    }
}
