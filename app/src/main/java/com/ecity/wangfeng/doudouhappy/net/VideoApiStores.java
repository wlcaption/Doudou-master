package com.ecity.wangfeng.doudouhappy.net;


import com.ecity.wangfeng.doudouhappy.model.VideoEntity;

import java.util.HashMap;
import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 */
public interface VideoApiStores {

    String API_SERVER_URL = "http://newapi.meipai.com/output/";

    /**
     * 获取视频列表
     * @param map
     * @return
     */
    @GET("channels_topics_timeline.json")
    Observable<List<VideoEntity>> getVideoList(@QueryMap HashMap<String, Object> map);
}
