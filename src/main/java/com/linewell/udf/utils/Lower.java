package com.linewell.udf.utils;

import com.aliyun.odps.udf.UDF;

public final  class Lower extends UDF{

    public String evaluate(String s){
        if (s == null) {
            return null;
        }
        return s.toLowerCase();
    }

//    public static void main(String[] args) {
//        String str = "ABC";
//        Lower lower = new Lower();
//        String res = lower.evaluate(str);
//        System.out.println(res);
//    }

}

