package com.cwj.music.service.impl;

import com.cwj.music.dao.SongDao;
import com.cwj.music.entity.Song;
import com.cwj.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceimpl implements SongService {
    @Autowired
    SongDao songDao;

    @Override
    public List<Song> querySongList() {
        return songDao.querySongList();
    }

    @Override
    public int addSong(Song song) {

        return songDao.addSong(song);
    }

    @Override
    public boolean querySongById(Integer id) {
        int i = songDao.querySongById(id);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public Song updateSong(Song song) {
        return songDao.updateSong(song);
    }

    @Override
    public boolean delSong(Integer id) {
        int i = songDao.delSong(id);
        if (i == 1) {
            return true;
        }
        return false;
    }
}
