package com.braze.ui.contentcards.recycler;

import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import kotlin.x.d.i;

public class SimpleItemTouchHelperCallback
  extends ItemTouchHelper.Callback
{
  private final ItemTouchHelperAdapter adapter;
  
  public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter paramItemTouchHelperAdapter)
  {
    adapter = paramItemTouchHelperAdapter;
  }
  
  public int getMovementFlags(RecyclerView paramRecyclerView, RecyclerView.b0 paramB0)
  {
    i.e(paramRecyclerView, "recyclerView");
    i.e(paramB0, "viewHolder");
    int i;
    if (adapter.isItemDismissable(paramB0.getBindingAdapterPosition())) {
      i = 16;
    } else {
      i = 0;
    }
    return ItemTouchHelper.Callback.makeMovementFlags(0, i);
  }
  
  public boolean isItemViewSwipeEnabled()
  {
    return true;
  }
  
  public boolean isLongPressDragEnabled()
  {
    return false;
  }
  
  public boolean onMove(RecyclerView paramRecyclerView, RecyclerView.b0 paramB01, RecyclerView.b0 paramB02)
  {
    i.e(paramRecyclerView, "recyclerView");
    i.e(paramB01, "viewHolder");
    i.e(paramB02, "target");
    return false;
  }
  
  public void onSwiped(RecyclerView.b0 paramB0, int paramInt)
  {
    i.e(paramB0, "viewHolder");
    adapter.onItemDismiss(paramB0.getBindingAdapterPosition());
  }
}
