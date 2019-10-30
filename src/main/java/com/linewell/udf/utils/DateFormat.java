package com.linewell.udf.utils;

import com.aliyun.odps.udf.UDF;
import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PrimitiveIterator;

public final class DateFormat extends UDF {

    public Date evaluate(String str) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date res = sf.parse(str);
            return res;
        } catch (ParseException e) {
            System.out.println(e);
            return null;
        }
    }

    public static void main(String[] args) {
        DateFormat df = new DateFormat();
        String str = "2019-12-01 19:20:22";
        Date res = df.evaluate(str);
        System.out.println(res);
    }

}
