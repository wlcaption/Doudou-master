package com.ecity.wangfeng.doudouhappy.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.ecity.wangfeng.doudouhappy.adapter.holder.VideoViewHolder;
import com.ecity.wangfeng.doudouhappy.model.VideoEntity;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * 作者：Rance on 2016/10/25 15:19
 * 邮箱：rance935@163.com
 */
public class VideoRecyclerAdapter extends RecyclerArrayAdapter<VideoEntity> {

    public VideoRecyclerAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new VideoViewHolder(parent);
    }
}
