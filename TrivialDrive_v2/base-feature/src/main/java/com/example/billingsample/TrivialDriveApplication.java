package com.example.billingsample;

import com.tune.Tune;
import com.tune.ma.application.TuneApplication;

public class TrivialDriveApplication extends TuneApplication {
    private static final String TUNE_ADVERTISER_ID = "190163";
    private static final String TUNE_CONVERSION_ID = "198dacaee0fd940d83ad259a27ec6fd5";

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize Tune
        Tune.init(this, TUNE_ADVERTISER_ID, TUNE_CONVERSION_ID);
    }
}
