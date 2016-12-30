package com.ecity.wangfeng.doudouhappy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecity.wangfeng.doudouhappy.R;
import com.ecity.wangfeng.doudouhappy.adapter.BaseFragmentAdapter;
import com.ecity.wangfeng.doudouhappy.base.BaseFragment;
import com.umeng.analytics.MobclickAgent;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 */
public class VideoFragment extends BaseFragment {

    @Bind(R.id.tabs)
    TabLayout mTabLayout;
    @Bind(R.id.viewpager)
    ViewPager mViewPager;

    private View rootView;
    List<Fragment> mFragments;
    String[] mTitles = new String[]{
            "热门", "搞笑", "逗比", "明星名人", "男神", "女神", "音乐", "舞蹈", "旅行", "美食", "美妆时尚", "涨姿势", "宝宝", "萌宠乐园", "二次元"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_video, container, false);
        }
        ButterKnife.bind(this, rootView);
        setupViewPager();
        return rootView;
    }

    private void setupViewPager() {
        mFragments = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
            VideoListFragment videoListFragment = new VideoListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("index", i);
            videoListFragment.setArguments(bundle);
            mFragments.add(videoListFragment);
        }
        // 第二步：为ViewPager设置适配器
        BaseFragmentAdapter adapter =
                new BaseFragmentAdapter(getChildFragmentManager(), mFragments, mTitles);

        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(1);
        //  第三步：将ViewPager与TableLayout 绑定在一起
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("VideoFragment"); //统计页面
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("VideoFragment");
    }

}
