package cn.edu.suda.cs.school.exception;

import cn.edu.suda.cs.school.enums.ResultEnum;
import lombok.Data;

/**
 * @program: school
 * @description: describe
 * @author: ChuChu
 * @create: 2021-10-17
 **/

@Data
public class UserException extends RuntimeException{
    private Integer code;

    public UserException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
