package com.example.simple_instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
         super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RfaNRfqmFdxMwoWBZp7Fc0vh1DFnIIsQ4g1eG42I")
                .clientKey("yRxJPUXOhhMMHd7csKguRj0izL4qVPRpqamWBzLV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
