package cn.edu.suda.cs.school.dataObject;

import cn.edu.suda.cs.school.enums.ResultEnum;
import lombok.Data;

/**
 * @program: School
 * @description: return to front end as Json pattern
 * @author: ChuChu
 * @create: 2021-10-17
 **/

@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

}
