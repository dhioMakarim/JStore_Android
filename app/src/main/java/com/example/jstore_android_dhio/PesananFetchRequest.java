package com.example.jstore_android_dhio;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class PesananFetchRequest extends StringRequest {

    public PesananFetchRequest(int id, Response.Listener<String> listener) {
        super(Configuration.URL_GET_INVOICE + id, listener, null);
    }
}
