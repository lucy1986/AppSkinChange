package com.meiyou.androidskin.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.meiyou.androidskin.R;
import com.meiyou.skinlib.AndroidSkin;

import java.util.List;

/**
 * Author: ice
 * Date: 1/30/18 09:22.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private List<Book> mBookList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bookImage;
        TextView bookname;

        public ViewHolder(View view) {
            super(view);
            bookImage = (ImageView) view.findViewById(R.id.image_book);
            bookname = (TextView) view.findViewById(R.id.text_book);
        }
    }

    public RecycleViewAdapter(List<Book> mBookList) {
        this.mBookList = mBookList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = AndroidSkin.getInstance().getLayoutInflater().inflate(R.layout.book,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Book book = mBookList.get(position);
        holder.bookname.setText(book.getName());
        //holder.bookImage.setImageResource(book.getImage());
    }
    @Override
    public int getItemCount() {
        return mBookList.size();
    }
}