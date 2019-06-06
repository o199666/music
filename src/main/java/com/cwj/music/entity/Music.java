package com.cwj.music.entity;


import static com.cwj.music.Utils.Config.IMAGE_URL;
import static com.cwj.music.Utils.Config.MUSIC_URL;

//音乐表
public class Music {
    private int id;
    private String name;
    private String image;
    private String playpath;
    private int songid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = IMAGE_URL+image;
    }

    public String getPlaypath() {
        return playpath;
    }

    public void setPlaypath(String playpath) {
        this.playpath =MUSIC_URL+ playpath;
    }

    public int getSongid() {
        return songid;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }
}
