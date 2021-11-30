package com.example.employeemanager.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
    }
}
