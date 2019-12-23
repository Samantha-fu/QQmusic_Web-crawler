package com.zks.model;

import java.util.Date;

public class BeanSongcomment {
    private String songCommentId;

    private String songId;

    private String userId;

    private Date commentTime;

    private Integer likeCount;

    private Integer commentSum;

    private String commentContent;

    public String getSongCommentId() {
        return songCommentId;
    }

    public void setSongCommentId(String songCommentId) {
        this.songCommentId = songCommentId == null ? null : songCommentId.trim();
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId == null ? null : songId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentSum() {
        return commentSum;
    }

    public void setCommentSum(Integer commentSum) {
        this.commentSum = commentSum;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}