package com.cwj.music.service;

import com.cwj.music.entity.Music;

import java.util.List;

public interface MusicService {
    List<Music> queryMusicBySongId(int id);


}
