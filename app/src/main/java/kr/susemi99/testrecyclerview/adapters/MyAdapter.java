package kr.susemi99.testrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kr.susemi99.testrecyclerview.Const;
import kr.susemi99.testrecyclerview.R;
import kr.susemi99.testrecyclerview.models.BaseModel;
import kr.susemi99.testrecyclerview.models.HeaderModel;
import kr.susemi99.testrecyclerview.models.RowModel;
import kr.susemi99.testrecyclerview.view_holders.HeaderViewHolder;
import kr.susemi99.testrecyclerview.view_holders.RowViewHolder;

public class MyAdapter extends RecyclerView.Adapter {
  private ArrayList<BaseModel> items = new ArrayList<>();

  public void add(BaseModel item) {
    items.add(item);
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    int resId = viewType == Const.VIEW_TYPE_ROW ? R.layout.list_item_row : R.layout.list_item_header;
    View v = LayoutInflater.from(parent.getContext()).inflate(resId, null, false);
    v.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    return viewType == Const.VIEW_TYPE_ROW ? new RowViewHolder(v) : new HeaderViewHolder(v);
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    BaseModel item = items.get(position);

    if (item.isHeader) {
      ((HeaderViewHolder) holder).nameView.setText(((HeaderModel) item).name);
    }
    else {
      ((RowViewHolder) holder).nameView.setText(((RowModel) item).name);
      ((RowViewHolder) holder).dateView.setText(((RowModel) item).date);
    }
  }

  @Override
  public int getItemCount() {
    return items.size();
  }

  @Override
  public int getItemViewType(int position) {
    return items.get(position).isHeader ? Const.VIEW_TYPE_HEADER : Const.VIEW_TYPE_ROW;
  }
}
