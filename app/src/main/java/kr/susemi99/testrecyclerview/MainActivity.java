package kr.susemi99.testrecyclerview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import kr.susemi99.testrecyclerview.adapters.MyAdapter;
import kr.susemi99.testrecyclerview.decorators.SimpleDividerItemDecoration;
import kr.susemi99.testrecyclerview.models.HeaderModel;
import kr.susemi99.testrecyclerview.models.RowModel;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView listView = (RecyclerView) findViewById(R.id.list_view);
    listView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    listView.addItemDecoration(new SimpleDividerItemDecoration(Color.RED, 5));

    MyAdapter adapter = new MyAdapter();
    adapter.add(new HeaderModel("1122"));
    adapter.add(new RowModel("111", "111"));
    adapter.add(new HeaderModel("222"));
    adapter.add(new RowModel("222", "222"));
    adapter.add(new RowModel("114", "225"));
    adapter.add(new RowModel("113", "224"));
    adapter.add(new RowModel("114", "225"));
    adapter.add(new RowModel("113", "224"));
    adapter.add(new HeaderModel("1123"));
    adapter.add(new RowModel("113", "224"));
    adapter.add(new RowModel("114", "225"));
    adapter.add(new RowModel("114", "225"));
    adapter.add(new HeaderModel("1122"));
    adapter.add(new RowModel("113", "224"));
    adapter.add(new RowModel("114", "225"));
    adapter.add(new RowModel("114", "225"));
    listView.setAdapter(adapter);
  }
}
