package com.meiyou.androidskin.recycleview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.meiyou.androidskin.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ice
 * Date: 1/30/18 09:19.
 */

public class RecycleViewActivity extends Activity {


    private List<Book> mlsit = new ArrayList<Book>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        //初始化List数据
        initBook();
        //初始化RecyclerView
        RecyclerView recyslerview = (RecyclerView) findViewById(R.id.recycler_view);
        //创建LinearLayoutManager 对象 这里使用 <span style="font-family: 'Source Code Pro';">LinearLayoutManager 是线性布局的意思</span>
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        //设置RecyclerView 布局
        recyslerview.setLayoutManager(layoutmanager);
        //设置Adapter
        RecycleViewAdapter adapter = new RecycleViewAdapter(mlsit);
        recyslerview.setAdapter(adapter);
    }

    private void initBook(){
        for (int i = 0; i < 10; i++) {
            Book book01 = new Book("Book"+i,R.drawable.ic_launcher);
            mlsit.add(book01);
            Book book02 = new Book("Book"+i,R.drawable.ic_launcher);
            mlsit.add(book02);
            Book book03 = new Book("Book"+i,R.drawable.ic_launcher);
            mlsit.add(book03);
        }
    }

}
