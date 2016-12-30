package com.ecity.wangfeng.doudouhappy.adapter.holder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ecity.wangfeng.doudouhappy.R;
import com.ecity.wangfeng.doudouhappy.model.NewsEntity;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewsViewHolder extends BaseViewHolder<NewsEntity.StoriesBean> {

    @Bind(R.id.item_news_title)
    TextView itemNewsTitle;
    @Bind(R.id.item_news_img)
    ImageView itemNewsImg;

    public NewsViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_news);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(NewsEntity.StoriesBean newsEntity) {
        Picasso.with(getContext()).load(newsEntity.getImages().get(0)).into(itemNewsImg);
        itemNewsTitle.setText(newsEntity.getTitle());
    }
}
