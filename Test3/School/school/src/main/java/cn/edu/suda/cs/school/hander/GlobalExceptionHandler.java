package cn.edu.suda.cs.school.hander;

import cn.edu.suda.cs.school.dataObject.Result;
import cn.edu.suda.cs.school.enums.ResultEnum;
import cn.edu.suda.cs.school.exception.UserException;
import cn.edu.suda.cs.school.utilities.ResultUtility;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: school
 * @description: description
 * @author: ChuChu
 * @create: 2021-10-17
 **/
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if(e instanceof UserException){
            UserException userException = (UserException) e;
            return ResultUtility.error(((UserException) e).getCode(), e.getMessage());
        }else{
            return ResultUtility.error(ResultEnum.SYSTEM_ERROR.getCode(),ResultEnum.SYSTEM_ERROR.getMsg());
        }
    }
}
