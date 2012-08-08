package com.devcloud.braindump;

import android.app.Activity;
import android.os.Bundle;

public class BrainDump extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.list_content);
    }
}
