package com.platzi.javatestmockito.payments;

public class StringUtil {
    public static boolean isEmpaty(String str){
        return str == null || str.trim().length()<=0;
    }

}
