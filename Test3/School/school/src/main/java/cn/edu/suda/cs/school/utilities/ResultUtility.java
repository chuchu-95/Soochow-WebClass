package cn.edu.suda.cs.school.utilities;

import cn.edu.suda.cs.school.dataObject.Result;
import cn.edu.suda.cs.school.enums.ResultEnum;

/**
 * @program: School
 * @description: description
 * @author: ChuChu
 * @create: 2021-10-17
 **/
public class ResultUtility {
    public static Result success(Object object){
        Result result = new Result(ResultEnum.SUCCESS, object);
        return result;
    }
    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
