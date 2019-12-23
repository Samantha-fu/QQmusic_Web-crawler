package com.zks.service;

import com.alibaba.fastjson.JSONObject;
import com.zks.model.BeanLyric;
import com.zks.tool.JsonUtil;
import com.zks.tool.MybatiesSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LyricService {
       //歌曲查询
       public List<JSONObject> loadBysongname(String singerName,String songName) throws Exception {
           List<BeanLyric> noticeList = null;
           JSONObject jsonObject = null;
           List<JSONObject> list = new ArrayList<JSONObject>();
           SqlSession session = MybatiesSession.getSession();
           BeanLyric lyric =new BeanLyric();
           lyric.setSongName(singerName);
           lyric.setArtistName(songName);
           noticeList = session.selectList("selectByname",lyric);
           System.out.println(noticeList.size());
           for(int i=0;i<noticeList.size();i++) {
               jsonObject = JsonUtil.LyricResult(200, noticeList.get(i));
               list.add(jsonObject);
           }
           session.commit();
           return list;
       }
    public static void main(String[] args) throws Exception {
        LyricService a = new LyricService();
        Date date = new Date();

        List<JSONObject> zs = a.loadBysongname("阿杜","Andy");
//        List<JSONObject> zs = a.loadByfens();
        System.out.println(zs);
    }
}
