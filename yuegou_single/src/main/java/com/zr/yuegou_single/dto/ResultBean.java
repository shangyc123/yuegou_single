package com.zr.yuegou_single.dto;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

    private static ResultBean resultBean = new ResultBean();

    private Integer errno;//成功：0    失败：1

    private T data;

    private String message;

    public static ResultBean error(){
        resultBean.setData(null);
        resultBean.setMessage("error");
        resultBean.setErrno(1);//成功
        return resultBean;
    }


    public static ResultBean error(String message){
        resultBean.setData(null);
        resultBean.setMessage(message);
        resultBean.setErrno(1);//失败
        return resultBean;
    }


    public static ResultBean success(){
        resultBean.setData(null);
        resultBean.setMessage("success");
        resultBean.setErrno(0);//成功
        return resultBean;
    }

    public static ResultBean success(String message){
        resultBean.setData(null);
        resultBean.setMessage(message);
        resultBean.setErrno(0);//成功
        return resultBean;
    }



    public static ResultBean success(Object data,String message){

        resultBean.setData(data);
        resultBean.setMessage(message);
        resultBean.setErrno(0);//成功


        return resultBean;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
