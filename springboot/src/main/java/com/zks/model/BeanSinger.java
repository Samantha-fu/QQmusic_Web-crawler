package com.zks.model;

public class BeanSinger {
    private String singerId;

    private String singername;

    private String gender;

    private String birthaddress;

    private String constellation;

    private Integer singles;

    private Integer album;

    private Integer mv;

    private Integer fens;

    public String getSingerId() {
        return singerId;
    }

    public void setSingerId(String singerId) {
        this.singerId = singerId == null ? null : singerId.trim();
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername(String singername) {
        this.singername = singername == null ? null : singername.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthaddress() {
        return birthaddress;
    }

    public void setBirthaddress(String birthaddress) {
        this.birthaddress = birthaddress == null ? null : birthaddress.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public Integer getSingles() {
        return singles;
    }

    public void setSingles(Integer singles) {
        this.singles = singles;
    }

    public Integer getAlbum() {
        return album;
    }

    public void setAlbum(Integer album) {
        this.album = album;
    }

    public Integer getMv() {
        return mv;
    }

    public void setMv(Integer mv) {
        this.mv = mv;
    }

    public Integer getFens() {
        return fens;
    }

    public void setFens(Integer fens) {
        this.fens = fens;
    }
}