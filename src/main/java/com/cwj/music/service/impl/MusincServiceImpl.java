package com.cwj.music.service.impl;

import com.cwj.music.dao.MusicDao;
import com.cwj.music.entity.Music;
import com.cwj.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusincServiceImpl implements MusicService {
    @Autowired
    MusicDao dao;
    @Override
    public List<Music> queryMusicBySongId(int id) {
        return dao.queryMusicBySongId(id);
    }
}
