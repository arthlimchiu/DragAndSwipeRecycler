package com.arthlimchiu.swipedragrecycler;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shang on 9/3/2015.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {

    TextView mName;

    public ItemViewHolder(View itemView) {
        super(itemView);
        mName = (TextView) itemView.findViewById(R.id.item_list_name);
    }

    @Override
    public void onItemSelected() {
        mName.setBackgroundColor(Color.LTGRAY);
    }

    @Override
    public void onItemClear() {
        mName.setBackgroundColor(Color.WHITE);
    }
}
