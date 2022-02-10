package com.poc.model;

import lombok.Data;

@Data
public class ErrorResponse {
    private String errorCode;
    private String errorMessage;
    public ErrorResponse(String errorCode, String errorMessage){
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;


    }
}
