package com.oubowu.secret;

import android.content.Context;
import android.os.Environment;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        String strFromCPlus = NdkHelper.getStrFromCPlus();

        NdkHelper.e(Environment.getExternalStorageDirectory()+ File.separator+"肯德基.jpg",Environment.getExternalStorageDirectory()+ File.separator+"加密-肯德基.jpg");

        assertEquals("com.oubowu.secret.test", appContext.getPackageName());
    }
}
