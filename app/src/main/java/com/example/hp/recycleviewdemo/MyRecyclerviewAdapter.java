package com.example.hp.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 2/13/2016.
 */
public class MyRecyclerviewAdapter extends RecyclerView.Adapter<MyRecyclerviewAdapter.ViewHolder> {
    ArrayList<PojoClass> pojoClassArrayAdapter;
    public MyRecyclerviewAdapter(ArrayList<PojoClass> pojoClassArrayAdapter){
        this.pojoClassArrayAdapter = pojoClassArrayAdapter;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        LinearLayout view = (LinearLayout)LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mytextview,viewGroup,false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        view.removeView(textView);
        ViewHolder viewHolder = new ViewHolder(textView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(pojoClassArrayAdapter.get(i).getNAME());
    }

    @Override
    public int getItemCount() {
        return pojoClassArrayAdapter.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(TextView itemView) {
            super(itemView);
            textView = (TextView)itemView;
        }
    }
}
