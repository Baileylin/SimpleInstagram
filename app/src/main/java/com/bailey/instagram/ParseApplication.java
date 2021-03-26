package com.bailey.instagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Jujk0MhpBr4hHt7LUZToWs0tojbJybnG2xccUrI4")
                .clientKey("i8Tsuy3uCayqk8qo0uhKc1kYh1T7KReGmsaSXyPC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
