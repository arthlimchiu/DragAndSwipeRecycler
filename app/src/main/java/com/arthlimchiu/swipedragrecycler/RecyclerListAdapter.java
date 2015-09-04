package com.arthlimchiu.swipedragrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by shang on 9/3/2015.
 */
public class RecyclerListAdapter extends RecyclerView.Adapter<ItemViewHolder> implements ItemTouchHelperAdapter{


    private String[] STRINGS = new String[]{
            "One", "Two", "Three",
            "Four", "Five", "Six",
            "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen",
            "Nineteen", "Twenty", "Twenty-One"
    };

    private List<String> mItems = new ArrayList<>();

    public RecyclerListAdapter() {
        mItems.addAll(Arrays.asList(STRINGS));
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int position) {
        itemViewHolder.mName.setText(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        if (fromPosition < toPosition) {
            for (int i = fromPosition; i < toPosition; i++) {
                Collections.swap(mItems, i, i + 1);
            }
        } else {
            for (int i = fromPosition; i > toPosition; i--) {
                Collections.swap(mItems, i, i - 1);
            }
        }
        notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public void onItemDismiss(int position) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }
}
