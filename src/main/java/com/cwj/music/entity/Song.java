package com.cwj.music.entity;

import java.io.Serializable;
import java.util.List;

import static com.cwj.music.Utils.Config.IMAGE_URL;

//歌单
public class Song implements Serializable {
    private int id;
    private int userid;
    private String song_name;
    private String image;
    private List<Music> musics;

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image =  image;
    }
}
