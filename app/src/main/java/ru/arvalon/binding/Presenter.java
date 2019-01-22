package ru.arvalon.binding;

import android.util.Log;
import android.view.View;

/**
 * Created by arvalon on 30.01.2018.
 */

public class Presenter {

    public void click (View v){
        Log.d("happy","short click");
    }

    public boolean big(View v){
        Log.d("happy","long click");
        return true;
    }
}
