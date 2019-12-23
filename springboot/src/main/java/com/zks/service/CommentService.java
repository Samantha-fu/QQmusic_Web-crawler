package com.zks.service;

import com.alibaba.fastjson.JSONObject;
import com.zks.model.BeanSong;
import com.zks.model.BeanSongcomment;
import com.zks.tool.JsonUtil;
import com.zks.tool.MybatiesSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class CommentService {
    //歌曲热评排行
    public List<JSONObject> loadCommentBysongname(String songName) throws Exception {
        List<BeanSongcomment> noticeList = null;
        JSONObject jsonObject = null;
        List<JSONObject> list = new ArrayList<JSONObject>();
        SqlSession session = MybatiesSession.getSession();
        noticeList = session.selectList("selectredu", songName);

        for (int i = 0; i < noticeList.size(); i++) {
            jsonObject = JsonUtil.CommentResult(200, noticeList.get(i));
            list.add(jsonObject);
        }
        session.commit();
        return list;
    }
    public List<JSONObject> loadsongBypl() throws Exception {
        List<BeanSong> noticeList = null;
        JSONObject jsonObject = null;
        List<JSONObject> list = new ArrayList<JSONObject>();

        SqlSession session = MybatiesSession.getSession();
        noticeList = session.selectList("selectplshu");

        for(int i=0;i<50;i++) {
            jsonObject = JsonUtil.SongResult(200, noticeList.get(i));
            list.add(jsonObject);
        }

        session.commit();
        return list;
    }
    public static void main(String[] args) throws Exception {
        CommentService a = new CommentService();
        List<JSONObject> zs = a.loadCommentBysongname("明天我要嫁给你");
//        List<JSONObject> zs = a.loadByablum();
        System.out.println(zs);
    }
}
