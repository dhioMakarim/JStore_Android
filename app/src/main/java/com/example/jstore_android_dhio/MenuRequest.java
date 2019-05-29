package com.example.jstore_android_dhio;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class MenuRequest extends StringRequest {

    public MenuRequest(Response.Listener<String> listener) {
        super(Configuration.URL_ITEM, listener, null);
    }

}
