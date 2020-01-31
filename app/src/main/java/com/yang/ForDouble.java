package com.yang;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Time:2019/11/28
 * Author: feisheng
 * Description:
 */
public class ForDouble {
    /**
     * 加法运算
     *
     * @param m1
     * @param m2
     * @return
     */
    public static double addDouble(double m1, double m2) {
        BigDecimal p1 = new BigDecimal(Double.toString(m1));
        BigDecimal p2 = new BigDecimal(Double.toString(m2));
        return p1.add(p2).doubleValue();
    }

    /**
     * 减法运算
     *
     * @param m1
     * @param m2
     * @return
     */
    public static double subDouble(double m1, double m2) {
        BigDecimal p1 = new BigDecimal(Double.toString(m1));
        BigDecimal p2 = new BigDecimal(Double.toString(m2));
        return p1.subtract(p2).doubleValue();
    }

    /**
     * 乘法运算
     *
     * @param m1
     * @param m2
     * @return
     */
    public static double mul(double m1, double m2) {
        BigDecimal p1 = new BigDecimal(Double.toString(m1));
        BigDecimal p2 = new BigDecimal(Double.toString(m2));
        return p1.multiply(p2).doubleValue();
    }

    /**
     * 除法运算
     *
     * @param m1
     * @param m2
     * @param scale
     * @return
     */
    public static double div(double m1, double m2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("Parameter error");
        }
        BigDecimal p1 = new BigDecimal(Double.toString(m1));
        BigDecimal p2 = new BigDecimal(Double.toString(m2));
        return p1.divide(p2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * @param m1
     * @return 返回保留小数点后两位的字符串
     */
    public static String doubletoString(double m1) {
        return new DecimalFormat("0.00").format(m1);
    }

    /**
     * @param m1
     * @return 返回保留小数点后两位的字符串
     */
    public static String stringtoString(String m1) {
        return new DecimalFormat("0.00").format(Double.parseDouble(m1));
    }

    public static double stringtoDouble(String m1) {
        return Double.parseDouble(new DecimalFormat("0.00").format(Double.parseDouble(m1)));
    }

    public static double doubletoDouble(double m1) {
        return Double.parseDouble(new DecimalFormat("0.00").format(m1));
    }
}
