package com.zks.service;

import com.alibaba.fastjson.JSONObject;
import com.zks.model.BeanArtist;
import com.zks.model.BeanSinger;
import com.zks.tool.JsonUtil;
import com.zks.tool.MybatiesSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SingerService {
    //查询歌手专辑与单曲数量
    public List<JSONObject> loadBySingername(String singerName) throws Exception {
        List<BeanSinger> noticeList = null;
        JSONObject jsonObject = null;
        List<JSONObject> list = new ArrayList<JSONObject>();

        SqlSession session = MybatiesSession.getSession();
        noticeList = session.selectList("selectzjgq",singerName);
        System.out.println(noticeList.size());
        for(int i=0;i<noticeList.size();i++) {
            jsonObject = JsonUtil.SingerResult(200, noticeList.get(i));
            list.add(jsonObject);
        }
        session.commit();
        return list;
    }
//个人信息
public List<JSONObject> loadxinxiBySingername(String singerName) throws Exception {
    List<BeanSinger> noticeList = null;
    JSONObject jsonObject = null;
    List<JSONObject> list = new ArrayList<JSONObject>();
    List<BeanArtist> notice2 = null;
    SqlSession session = MybatiesSession.getSession();
    notice2=session.selectList("selecttupian", (Object) singerName);
    noticeList = session.selectList("selectxinxi",singerName);
    System.out.println(noticeList.size());
    for(int k=0;k<noticeList.size();k++) {
        jsonObject = JsonUtil.ArtistResult(200, notice2.get(k));
        list.add(jsonObject);
    }
    for(int i=0;i<noticeList.size();i++) {
        jsonObject = JsonUtil.SingerResult(200, noticeList.get(i));
        list.add(jsonObject);
    }
    session.commit();
    return list;
}
    //歌手粉丝排行榜
    public List<JSONObject> loadByfens() throws Exception {
        List<BeanSinger> noticeList = null;
        JSONObject jsonObject = null;
        List<JSONObject> list = new ArrayList<JSONObject>();

        SqlSession session = MybatiesSession.getSession();
        noticeList = session.selectList("selectbyfens");

        for(int i=0;i<50;i++) {
            jsonObject = JsonUtil.SingerResult(200, noticeList.get(i));
            list.add(jsonObject);
        }

        session.commit();
        return list;
    }
    //歌手单曲数排行榜
    public List<JSONObject> loadBysingles() throws Exception {
        List<BeanSinger> noticeList = null;
        JSONObject jsonObject = null;
        List<JSONObject> list = new ArrayList<JSONObject>();

        SqlSession session = MybatiesSession.getSession();
        noticeList = session.selectList("selectbysingles");

        for(int i=0;i<50;i++) {
            jsonObject = JsonUtil.SingerResult(200, noticeList.get(i));
            list.add(jsonObject);
        }

        session.commit();
        return list;
    }
    //歌手专辑数排行榜
    public List<JSONObject> loadByablum() throws Exception {
        List<BeanSinger> noticeList = null;
        JSONObject jsonObject = null;
        List<JSONObject> list = new ArrayList<JSONObject>();

        SqlSession session = MybatiesSession.getSession();
        noticeList = session.selectList("selectbyablum");

        for(int i=0;i<50;i++) {
            jsonObject = JsonUtil.SingerResult(200, noticeList.get(i));
            list.add(jsonObject);
        }

        session.commit();
        return list;
    }
    public static void main(String[] args) throws Exception {
        SingerService a = new SingerService();
        Date date = new Date();

//        List<JSONObject> zs = a.loadxinxiBySingername("TAL");
        List<JSONObject> zs = a.loadByablum();
        System.out.println(zs);
    }

}
