package com.example.jstore_android_dhio;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class PesananSelesaiRequest extends StringRequest {

    public PesananSelesaiRequest(int id, Response.Listener<String> listener) {
        super(Method.POST, Configuration.URL_FINISH_TRANSACTION + id, listener, null);
    }
}
