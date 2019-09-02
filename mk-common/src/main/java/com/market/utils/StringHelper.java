package com.market.utils;

/**
 * @ClassName StringHelper
 * @Description: TODO
 * @Author zhnegweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
public class StringHelper {
    public static Boolean IsNullOrEmpety(String para){
        if (para!=null&&para.length()!=0) {
            return false;
        }
        return true;
    }
}
