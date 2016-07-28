package kr.susemi99.testrecyclerview.view_holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import kr.susemi99.testrecyclerview.R;


public class RowViewHolder extends RecyclerView.ViewHolder {
  public TextView nameView;
  public TextView dateView;

  public RowViewHolder(View itemView) {
    super(itemView);
    nameView = (TextView) itemView.findViewById(R.id.name_view);
    dateView = (TextView) itemView.findViewById(R.id.date_view);
  }
}
