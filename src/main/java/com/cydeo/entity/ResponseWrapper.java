package com.cydeo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseWrapper {

    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    public ResponseWrapper(String message, Object data, HttpStatus httpStatus) {
        this.message = message;
        this.data = data;
        this.success=true;
        this.code= httpStatus.value();
    }

    public ResponseWrapper(String message, HttpStatus httpStatus){
        this.message = message;
        this.success = true;
        this.code = httpStatus.value();
    }
}
