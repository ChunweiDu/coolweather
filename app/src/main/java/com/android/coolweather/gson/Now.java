package com.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by duchunwei on 2017/2/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("text")
        public String info;
    }
}
