package com.cwj.music.controller;

import com.cwj.music.Utils.ResultUtil;
import com.cwj.music.entity.Result;
import com.cwj.music.entity.Song;
import com.cwj.music.service.MusicService;
import com.cwj.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.cwj.music.Utils.Config.IMAGE_URL;
import static com.cwj.music.Utils.Config.MUSIC_URL;

@RestController
public class SongController {
    @Autowired
    public SongService songService;
    @Autowired
    public MusicService musicService;
    ResultUtil resultUtil=new ResultUtil();


    @RequestMapping(value = "/querySongList", method = RequestMethod.GET)
    public Result querySongList() {
        return resultUtil.success(songService.querySongList());
    }

    @RequestMapping(value = "/querySongListMusics", method = RequestMethod.GET)
    public Result querySongListMusics(){
        List list = new ArrayList();//这个是为了song music
        List<Song> songs=  songService.querySongList();
        for (int i = 0; i <songs.size() ; i++) {
            Song s = new Song();
            List l =  musicService.queryMusicBySongId(songs.get(i).getId());
            s.setId(songs.get(i).getId());
            s.setSong_name(songs.get(i).getSong_name());
            s.setImage(IMAGE_URL+songs.get(i).getImage());
            s.setUserid(7);
            s.setMusics(l);
            list.add(s);
        }
        return resultUtil.success(list);
    }

    @PostMapping(value = "/addSong")
    public Result addSong(@RequestBody Song song){
        if (songService.addSong(song)==1){//注册成功
            return resultUtil.success("添加成功");
        }
        return resultUtil.success("添加失败");
    }

    @PostMapping(value ="/updateSong")
    public Result updateSong(@RequestBody Song song){
        return resultUtil.success(song);
    }
    @GetMapping(value = "/delSong/{id}")
    public  Result delSong(@PathVariable Integer id){

        return resultUtil.success("");
    }

}
