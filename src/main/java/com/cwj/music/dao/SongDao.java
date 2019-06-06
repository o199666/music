package com.cwj.music.dao;

import com.cwj.music.entity.Song;
import com.cwj.music.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongDao {
    List<Song> querySongList();

    int addSong(Song song);

    int querySongById(Integer id);

    Song updateSong(Song song);

    int delSong(Integer id);



}
