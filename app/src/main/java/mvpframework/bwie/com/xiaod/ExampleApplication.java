package mvpframework.bwie.com.xiaod;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by CZ on 2017/11/14.
 */
public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

    }
}
