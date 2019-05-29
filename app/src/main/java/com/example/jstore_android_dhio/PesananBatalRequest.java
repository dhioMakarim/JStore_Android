package com.example.jstore_android_dhio;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class PesananBatalRequest extends StringRequest {

    public PesananBatalRequest(int id, Response.Listener<String> listener) {
        super(Method.POST, Configuration.URL_CANCEL_TRANSACTION + id, listener, null);
    }
}
