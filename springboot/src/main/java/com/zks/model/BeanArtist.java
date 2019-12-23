package com.zks.model;

public class BeanArtist {
    private String artistId;

    private String artistName;

    private Integer albumSize;

    private Integer musicSize;

    private String artistPicUrl;

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId == null ? null : artistId.trim();
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName == null ? null : artistName.trim();
    }

    public Integer getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(Integer albumSize) {
        this.albumSize = albumSize;
    }

    public Integer getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(Integer musicSize) {
        this.musicSize = musicSize;
    }

    public String getArtistPicUrl() {
        return artistPicUrl;
    }

    public void setArtistPicUrl(String artistPicUrl) {
        this.artistPicUrl = artistPicUrl == null ? null : artistPicUrl.trim();
    }
}