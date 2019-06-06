package com.cwj.music.Utils;

import com.cwj.music.entity.Result;

import java.util.List;

public class ResultUtil  {
    //当正确时返回的值
    public Result  success(Object data){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("OK");
        result.setData(data);
        return result;
    }
    //当错误时返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}
