package com.example.jstore_android_dhio;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class ItemRequest extends StringRequest {

    public ItemRequest(int id, Response.Listener<String> listener) {
        super(Configuration.URL_ITEM + id, listener, null);
    }
}
