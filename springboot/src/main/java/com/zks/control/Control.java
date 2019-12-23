package com.zks.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zks.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin

//@ResponseBody
public class Control {
    //搜索歌词
    @RequestMapping(value = "/loadlyric", method = RequestMethod.POST)
    public JSONObject showLyric(@RequestParam("singerName") String singerName, @RequestParam("songName") String songName) throws Exception {
        LyricService lyricService = new LyricService();
        String a = JSON.toJSONString( lyricService.loadBysongname(singerName,songName));
        JSONArray array= JSONArray.parseArray(a);
        JSONObject result = new JSONObject();
        result.put("lyric",array);
        return result;
    }
    //查看粉丝排行榜
    @RequestMapping(value = "/fens", method = RequestMethod.GET)
    public JSONObject showfens() throws Exception {
        SingerService fensService = new SingerService();
        String fens = JSON.toJSONString( fensService.loadByfens());
        JSONArray array= JSONArray.parseArray(fens);
        JSONObject result = new JSONObject();
        result.put("code",0);
        result.put("msg","");
        result.put("count",50);
        result.put("data",array);
        return result;
    }
    //查看单曲排行榜
    @RequestMapping(value = "/singles", method = RequestMethod.GET)
    public JSONObject showsingles() throws Exception {
        SingerService fensService = new SingerService();
        String singles = JSON.toJSONString( fensService.loadBysingles());
        JSONArray array= JSONArray.parseArray(singles);
        JSONObject result = new JSONObject();
        result.put("code",0);
        result.put("msg","");
        result.put("count",50);
        result.put("data",array);
        return result;
    }
    //查看专辑排行榜
    @RequestMapping(value = "/ablum", method = RequestMethod.GET)
    public JSONObject showablum() throws Exception {
        SingerService ablumService = new SingerService();
        String ablum = JSON.toJSONString( ablumService.loadByablum());
        JSONArray array= JSONArray.parseArray(ablum);
        JSONObject result = new JSONObject();
        result.put("code",0);
        result.put("msg","");
        result.put("count",50);
        result.put("data",array);
        return result;
    }
    //搜索作品数量
    @RequestMapping(value = "/zjdq", method = RequestMethod.POST)
    public JSONObject showzjdq(@RequestParam("singerName") String singerName) throws Exception {
        SingerService zjdqService = new SingerService();
        String zjdq = JSON.toJSONString( zjdqService.loadBySingername(singerName));
        JSONArray array= JSONArray.parseArray(zjdq);
        JSONObject result = new JSONObject();
        result.put("zjdq",array);
        return result;
    }
    //歌手信息
    @RequestMapping(value = "/xinxi", method = RequestMethod.POST)
    public JSONObject showxinxi(@RequestParam("singerName") String singerName) throws Exception {
        SingerService xinxiService = new SingerService();
        String xinxi = JSON.toJSONString( xinxiService.loadxinxiBySingername(singerName));
        JSONArray array= JSONArray.parseArray(xinxi);
        JSONObject result = new JSONObject();
        result.put("xinxi",array);
        return result;
    }
    //查询专辑信息
    @RequestMapping(value = "/ablumxinxi", method = RequestMethod.POST)
    public JSONObject showablumxinxi(@RequestParam("albumName") String albumName) throws Exception {
        AlbumService xinxiService = new AlbumService();
        String xinxi = JSON.toJSONString( xinxiService.loadxinxiByAlbumname(albumName));
        JSONArray array= JSONArray.parseArray(xinxi);
        JSONObject result = new JSONObject();
        result.put("ablumxinxi",array);
        return result;
    }
    //查看歌曲评论
    @RequestMapping(value = "/gequredu", method = RequestMethod.POST)
    public JSONObject showgequredu(@RequestParam("songName") String songName) throws Exception {
        CommentService xinxiService = new CommentService();
        String xinxi = JSON.toJSONString( xinxiService.loadCommentBysongname(songName));
        JSONArray array= JSONArray.parseArray(xinxi);
        JSONObject result = new JSONObject();
        result.put("code",0);
        result.put("msg","");
        result.put("count",50);
        result.put("data",array);
        return result;
    }
    @RequestMapping(value = "/pinlun", method = RequestMethod.GET)
    public JSONObject showpl() throws Exception {
        CommentService plService = new CommentService();
        String pl = JSON.toJSONString( plService.loadsongBypl());
        JSONArray array= JSONArray.parseArray(pl);
        JSONObject result = new JSONObject();
        result.put("code",0);
        result.put("msg","");
        result.put("count",50);
        result.put("data",array);
        return result;
    }
}
