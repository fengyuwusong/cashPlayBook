package cn.niriqiang.cashPlayBook.util;

/**
 * 日期处理
 * Created by fengyuwusong on 2017/12/18 21:19.
 */
public class DateUtil {
    /**
     * 获取某天凌晨的时间戳
     *
     * @param timeStamp
     *
     * @return long 时间戳
     */
    public static long getDaybreak(long timeStamp) {
        long daySecond = 60 * 60 * 24;
        return timeStamp - (timeStamp + 8 * 3600) % daySecond;
    }
}
