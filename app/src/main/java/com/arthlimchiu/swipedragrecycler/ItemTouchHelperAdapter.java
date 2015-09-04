package com.arthlimchiu.swipedragrecycler;

import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by shang on 9/3/2015.
 */
public interface ItemTouchHelperAdapter {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}
