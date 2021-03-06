package com.yuanchuangli.coolerweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Blank
 * @description Forecast
 * @time 2017/1/18 10:22
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
