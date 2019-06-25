package com.ruide.subway.utils;

import com.orhanobut.logger.Logger;
import com.ruide.subway.BuildConfig;

/**
 * 日志打印工具类
 *
 * @author chengliang0315
 * @see <a>http://blog.csdn.net/chengliang0315</a>
 */
public class LogUtils {
    /**
     * 是否开启debug
     * 注意：使用Eclipse打包的时候记得取消Build Automatically，否则一直是true
     */
    public static boolean isDebug= BuildConfig.DEBUG;

    /**
     * 错误
     */
    public static void e(String tag, String msg){
        if(isDebug){
            Logger.t(tag).e(msg+"");
        }
    }
    /**
     * 调试
     */
    public static void d(String tag,String msg){
        if(isDebug){
            Logger.t(tag).d( msg+"");
        }
    }
    /**
     * 信息
     */
    public static void i(String tag,String msg){
        if(isDebug){
            Logger.t(tag).i( msg+"");
        }
    }

    public static void json(String tag,String msg){
        if(isDebug){
            Logger.t(tag).json(msg);
        }
    }
}