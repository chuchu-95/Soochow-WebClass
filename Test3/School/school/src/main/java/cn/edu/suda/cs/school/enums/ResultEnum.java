package cn.edu.suda.cs.school.enums;

/**
 * @program: school
 * @description: n
 * @author: ChuChu
 * @create: 2021-10-20
 **/
public enum ResultEnum {
    SYSTEM_ERROR(-1, "Error"),
    SUCCESS(0, "success"),
    ENERGY(100, "energy"),
    HARD_WORK(200, "hard work");
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
