package com.zks.service;

import com.alibaba.fastjson.JSONObject;
import com.zks.model.BeanAlbum;
import com.zks.tool.JsonUtil;
import com.zks.tool.MybatiesSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlbumService {
   //查询专辑信息
   public List<JSONObject> loadxinxiByAlbumname(String albumName) throws Exception {
       List<BeanAlbum> noticeList = null;
       JSONObject jsonObject = null;
       List<JSONObject> list = new ArrayList<JSONObject>();
       SqlSession session = MybatiesSession.getSession();
       noticeList = session.selectList("selectAlbum",albumName);
       System.out.println(noticeList.size());
       for(int i=0;i<noticeList.size();i++) {
           jsonObject = JsonUtil.AlbumResult(200, noticeList.get(i));
           list.add(jsonObject);
       }
       session.commit();
       return list;
   }
    public static void main(String[] args) throws Exception {
        AlbumService a = new AlbumService();
        Date date = new Date();

//        List<JSONObject> zs = a.loadxinxiBySingername("TAL");
        List<JSONObject> zs = a.loadxinxiByAlbumname("听海的生音");
        System.out.println(zs);
    }
}

