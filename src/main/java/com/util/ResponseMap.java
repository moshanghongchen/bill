package com.util;

import lombok.Data;

@Data
public class ResponseMap {
    public static final String FIELD="0";
    public static final String SUCCESS="1";

    private String resCode;
    private String resMsg;
    private Object result;
    public ResponseMap(String resCode,String resMsg,Object result){
        this.resCode=resCode;
        this.resMsg=resMsg;
        this.result=result;
    }
}
