package com.example.pastagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uBKzecAHUdUiTCJPtJsSRTnGNwHJDp2QRfumgSt8")
                .clientKey("qPfcEhDNxK2upwM7ldZ8K6Krd5IUpslKtPVIkMMF")
                .server("https://parseapi.back4app.com")
                .build()
        );
}
}
