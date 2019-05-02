package com.example.jstore_android_dhio;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MainRequest extends StringRequest {
    private static final String Regis_URL = "http://10.0.2.2/items";
    private Map<String, String> params;

    public MainRequest(String name, String category, String status, Supplier supplier,
                       Response.Listener<String> listener){
        super(Method.GET, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("category", category);
        params.put("status", status);
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
