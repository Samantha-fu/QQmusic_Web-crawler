package com.zks.tool;

import com.alibaba.fastjson.JSONObject;
import com.zks.model.*;

import java.text.SimpleDateFormat;


public class JsonUtil {
    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static JSONObject errorResult(int port, String ErrorResult){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("ErrorResult",ErrorResult);
        return jsonObject;
    }
    //用户
    public static JSONObject UserResult(int port, BeanUser user){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("userid",user.getUserid());
        jsonObject.put("username",user.getUsername());
        jsonObject.put("userpwd",user.getAvatarUrl());
        return jsonObject;
    }
    //唱片
    public static JSONObject AlbumResult(int port, BeanAlbum album){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("albumid",album.getAlbumId());
        jsonObject.put("artistid",album.getArtistId());
        jsonObject.put("publishtime",album.getPublishTime());
        jsonObject.put("albumname",album.getAlbumName());
        jsonObject.put("albumpicurl",album.getAlbumPicUrl());
        jsonObject.put("subcount",album.getSubCount());
        jsonObject.put("commentcount",album.getCommentCount());
        jsonObject.put("sharecount",album.getShareCount());
        jsonObject.put("introduction",album.getIntroduction());
        return jsonObject;
    }
    //歌手
    public static JSONObject ArtistResult(int port, BeanArtist artist){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("artistid",artist.getArtistId());
        jsonObject.put("albumsize",artist.getAlbumSize());
        jsonObject.put("artistname",artist.getArtistName());
        jsonObject.put("musicsize",artist.getMusicSize());
        jsonObject.put("artistPicUrl",artist.getArtistPicUrl());
        return jsonObject;
    }
    //歌词
    public static JSONObject LyricResult(int port, BeanLyric lyric){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("lyricid",lyric.getLyricId());
        jsonObject.put("songname",lyric.getSongName());
        jsonObject.put("artistname",lyric.getArtistName());
        jsonObject.put("lyric",lyric.getLyric());
        return jsonObject;
    }
    //歌曲
    public static JSONObject SongResult(int port, BeanSong song){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("songid",song.getSongId());
        jsonObject.put("songname",song.getSongName());
        jsonObject.put("albumid",song.getAlbumId());
        jsonObject.put("artistId",song.getArtistId());
        jsonObject.put("commentcount",song.getCommentCount());
        return jsonObject;
    }
    //歌曲评论
    public static JSONObject CommentResult(int port, BeanSongcomment comment){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("songcommentid",comment.getSongCommentId());
        jsonObject.put("songid",comment.getSongId());
        jsonObject.put("userid",comment.getUserId());
        jsonObject.put("commenttime",comment.getCommentTime());
        jsonObject.put("likecount",comment.getLikeCount());
        jsonObject.put("commentsum",comment.getCommentSum());
        jsonObject.put("commentcontent",comment.getCommentContent());
        return jsonObject;
    }
    //歌手个人信息
    public static JSONObject SingerResult(int port, BeanSinger singer){
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("port",port);
        jsonObject.put("singerid",singer.getSingerId());
        jsonObject.put("singername",singer.getSingername());
        jsonObject.put("gender",singer.getGender());
        jsonObject.put("birthaddress",singer.getBirthaddress());
        jsonObject.put("constellation",singer.getConstellation());
        jsonObject.put("singles",singer.getSingles());
        jsonObject.put("album",singer.getAlbum());
        jsonObject.put("mv",singer.getMv());
        jsonObject.put("fens",singer.getFens());
        return jsonObject;
    }

}
