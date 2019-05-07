package com.example.jstore_android_dhio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Supplier> listSupplier = new ArrayList<>();
    private ArrayList<Item> listItem = new ArrayList<>();
    private HashMap<Supplier, ArrayList<Item>> childMapping = new HashMap<>();
    MainListAdapter listAdapter;
    ExpandableListView expListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAdapter = new MainListAdapter(MainActivity.this, listSupplier, childMapping);
        expListView.setAdapter(listAdapter);
    }

    protected void refreshList(){
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONArray jsonResponse = new JSONArray(response);
                    for (int i=0; i<jsonResponse.length(); i++){
                        JSONObject item = jsonResponse.getJSONObject(i);
                        JSONObject supplier = item.getJSONObject("supplier");
                        JSONObject location = supplier.getJSONObject("location");

                        Location tempLocation = new Location(location.getString("city"),
                                location.getString("province"),
                                location.getString("description"));
                        Supplier tempSupplier = new Supplier(supplier.getInt("id"),
                                supplier.getString("name"),
                                supplier.getString("email"),
                                supplier.getString("phoneNumber"),
                                tempLocation);
                        Item tempItem = new Item(item.getInt("id"),
                                item.getString("name"),
                                item.getInt("price"),
                                item.getString("category"),
                                item.getString("status"),
                                tempSupplier);
                        listSupplier.add(tempSupplier);
                        listItem.add(tempItem);
                        childMapping.put(listSupplier.get(i), listItem);
                    }
                } catch (JSONException e){

                }
            }
        };
    }

}
