package com.example.jstore_android_dhio;

import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BuatPesananRequest extends StringRequest{

    private Map<String, String> params;

    public BuatPesananRequest(ArrayList<Integer> listItem, String id_customer, Response.Listener<String> listener) {
        super(Method.POST, Configuration.URL_SELL_PAID, listener, null);

        String[] str= new String[listItem.size()];
        Object[] objArr = listItem.toArray();

        int i = 0;
        for(Object obj : objArr)
        {
            str[i++] = Integer.toString((Integer)obj);
        }

        String newString = Arrays.toString(str);
        newString = newString.substring(1, newString.length()-1);

        params = new HashMap<>();
        params.put("listItem", newString);
        params.put("id_customer", id_customer);
    }

    public BuatPesananRequest(ArrayList<Integer> listItem, String id_customer, Response.Listener<String> listener, boolean unpaid) {
        super(Method.POST, Configuration.URL_SELL_UNPAID, listener, null);

        String[] str= new String[listItem.size()];
        Object[] objArr = listItem.toArray();

        int i = 0;
        for(Object obj : objArr)
        {
            str[i++] = Integer.toString((Integer)obj);
        }

        String newString = Arrays.toString(str);
        newString = newString.substring(1, newString.length()-1);

        params = new HashMap<>();
        params.put("listItem", newString);
        params.put("id_customer", id_customer);
    }

    public BuatPesananRequest(ArrayList<Integer> listItem, int installment_period, String id_customer, Response.Listener<String> listener) {
        super(Method.POST, Configuration.URL_SELL_INSTALLMENT, listener, null);

        String[] str= new String[listItem.size()];
        Object[] objArr = listItem.toArray();

        int i = 0;
        for(Object obj : objArr)
        {
            str[i++] = Integer.toString((Integer)obj);
        }

        String newString = Arrays.toString(str);
        newString = newString.substring(1, newString.length()-1);

        params = new HashMap<>();
        params.put("listItem", newString);
        params.put("installment_period", Integer.toString(installment_period));
        params.put("id_customer", id_customer);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
