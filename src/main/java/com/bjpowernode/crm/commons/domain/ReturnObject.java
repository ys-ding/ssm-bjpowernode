package com.bjpowernode.crm.commons.domain;

public class ReturnObject {
    private String Code;//处理成功获取失败的标记：1---成功，0---失败
    private String Message;//提示信息
    private String RetData;//其它数据

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getRetData() {
        return RetData;
    }

    public void setRetData(String retData) {
        RetData = retData;
    }
}
