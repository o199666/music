package com.cwj.music.dao;

import com.cwj.music.entity.Music;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MusicDao {
    List<Music> queryMusicBySongId(int id);
}
