package com.ttn.bootcamp.restful.assignment.restfulassignment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{
    private String message;
    public EmployeeNotFoundException(String message) {
        super(message);
    }

}
