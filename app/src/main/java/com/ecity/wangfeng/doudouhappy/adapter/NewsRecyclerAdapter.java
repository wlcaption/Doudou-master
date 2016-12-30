package com.ecity.wangfeng.doudouhappy.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.ecity.wangfeng.doudouhappy.adapter.holder.NewsViewHolder;
import com.ecity.wangfeng.doudouhappy.model.NewsEntity;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * 作者：Rance on 2016/10/25 15:19
 * 邮箱：rance935@163.com
 */
public class NewsRecyclerAdapter extends RecyclerArrayAdapter<NewsEntity.StoriesBean> {

    public NewsRecyclerAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(parent);
    }
}
