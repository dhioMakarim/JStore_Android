package com.example.jstore_android_dhio;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainListAdapter extends BaseExpandableListAdapter {
    Context context;
    private ArrayList<Supplier> listSupplier;
    private HashMap<Supplier, ArrayList<Item>> childMapping;

    public MainListAdapter(Context context, ArrayList<Supplier> listSupplier,
                           HashMap<Supplier, ArrayList<Item>> childMapping){
        this.context = context;
        this.listSupplier = listSupplier;
        this.childMapping = childMapping;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition){
        return this.childMapping.get(this.listSupplier.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, final int childPosition){
        return childPosition;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public int getGroupCount() {
        return this.listSupplier.size();
    }
}
