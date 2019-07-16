package testpom.liu.com.myapplication;

import android.util.Log;

/**
 * Created by liushichao on 2019/7/11.
 */

public class Parcent {
    static {
        Log.i("-------","父类静态块");
    }

    static {
        Log.i("-------","父类普通块");
    }

    public Parcent(){
        Log.i("-------","父类构造块");
    }
}
