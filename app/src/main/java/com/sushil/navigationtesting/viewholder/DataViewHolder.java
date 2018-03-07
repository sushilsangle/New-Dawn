package com.sushil.navigationtesting.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sushil.navigationtesting.R;

public class DataViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
 
        public DataViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.txt_header);
        }
}