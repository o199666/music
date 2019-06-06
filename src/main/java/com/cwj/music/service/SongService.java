package com.cwj.music.service;

import com.cwj.music.entity.Song;

import java.util.List;

public interface SongService {

    List<Song> querySongList();

    int addSong(Song song);

    boolean querySongById(Integer id);

    Song updateSong(Song song);

    boolean delSong(Integer id);
}
