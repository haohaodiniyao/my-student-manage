package com.example.common;

/**
 * 返回结果工具类
 */
public class ResultUtil {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result();
        result.setErrCode(200);
        result.setErrMsg("成功");
        result.setData(data);
        return result;
    }

    /**
     * 失败
     * @return
     */
    public static Result fail() {
        Result result = new Result();
        result.setErrCode(500);
        result.setErrMsg("失败");
        result.setData((Object)null);
        return result;
    }
}
