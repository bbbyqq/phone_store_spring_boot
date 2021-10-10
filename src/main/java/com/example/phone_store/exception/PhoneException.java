package com.example.phone_store.exception;

import com.example.phone_store.enums.ResultEnum;

public class PhoneException extends RuntimeException {
    public PhoneException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
    }

    public PhoneException(String error) {
        super(error);
    }
}
