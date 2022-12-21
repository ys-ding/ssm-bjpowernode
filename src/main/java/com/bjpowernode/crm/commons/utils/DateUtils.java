package com.bjpowernode.crm.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 对Date类型进行处理的工具类
 */
public class DateUtils {
    /**
     * 对Date类型进行处理的工具类yyyy-MM-dd HH:mm:ss
     */
    public static String formatDateUtils(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }
//     /**
//     * 对Date类型进行处理的工具类yyyy-MM-dd
//     */
//    public static String formatDate(Date date){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String dateStr = sdf.format(date);
//        return dateStr;
//    }
//     /**
//     * 对Date类型进行处理的工具类yyyy-MM-dd HH:mm:ss
//     */
//    public static String formatTime(Date date){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateStr = sdf.format(date);
//        return dateStr;
//    }
}
