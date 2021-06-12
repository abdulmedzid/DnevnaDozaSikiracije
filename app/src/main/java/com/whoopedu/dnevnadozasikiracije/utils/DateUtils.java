package com.whoopedu.dnevnadozasikiracije.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
    public static Date getDateFromString(String dateString) {
        if(dateString == null) return null;
        ParsePosition pos = new ParsePosition(0);
        SimpleDateFormat simpledateformat = new SimpleDateFormat(
                "EEE, dd MMM yyyy hh:mm:ss"
        );
        return simpledateformat.parse(dateString, pos);
    }
}
