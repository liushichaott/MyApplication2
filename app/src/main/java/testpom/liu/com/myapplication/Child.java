package testpom.liu.com.myapplication;

import android.util.Log;

/**
 * Created by liushichao on 2019/7/11.
 */

public class Child extends Parcent {
    static {
        Log.i("-------","子类静态块");
    }

    static {
        Log.i("-------","子类普通块");
    }

    public Child(){
        Log.i("-------","子类构造块");
    }
}
