package ga.zhuzimo.moserver.base.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 通用接口返回对象
 */
public class TCommonResponse<T> {

    //默认成功状态
    public static final String SUCCESS = "0";
    //默认失败状态
    public static final String ERROR = "-1";

    //接口状态
    private String status = ERROR;
    //接口消息
    private String msg = "";
    //接口返回对象
    private T data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //失败
    public void setFailed(String status,String msg){
        setStatus(status);
        setMsg(msg);
    }

    //带返回对象的成功
    public void setSuccess(T data){
        setStatus(SUCCESS);
        setData(data);
    }

    //没有返回对象的成功
    public void setSuccess(){
        setSuccess(null);
    }

    //判断是否成功
    @JsonIgnore
    public boolean isSuccess(){
        return SUCCESS.equals(status);
    }
}
