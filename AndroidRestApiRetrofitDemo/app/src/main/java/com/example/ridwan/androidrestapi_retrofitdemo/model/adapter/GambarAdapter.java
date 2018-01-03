package com.example.ridwan.androidrestapi_retrofitdemo.model.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ridwan on 03/01/18.
 */

public class GambarAdapter  extends RecyclerView.Adapter<GambarAdapter.Holder> {


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(parent.getContext()).inflate(0, parent, false);
        return new Holder(row);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class Holder extends RecyclerView.ViewHolder {

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
