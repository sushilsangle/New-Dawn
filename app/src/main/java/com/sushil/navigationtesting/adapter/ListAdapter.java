package com.sushil.navigationtesting.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.interfaces.RecyclerItemClickInterface;
import com.sushil.navigationtesting.viewholder.DataViewHolder;

import java.util.List;
 
public class ListAdapter extends RecyclerView.Adapter<DataViewHolder> {

    private List<String> list;
    private RecyclerItemClickInterface clickInterface;

    public ListAdapter(List<String> list, RecyclerItemClickInterface clickInterface) {

        this.list = list;
        this.clickInterface=clickInterface;
    }
 
    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new DataViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.title.setText(list.get(position));
        holder.itemView.setOnClickListener( it -> clickInterface.passFragmentName(list.get(position)));
    }
 
    @Override
    public int getItemCount() {
        return list.size();
    }
}