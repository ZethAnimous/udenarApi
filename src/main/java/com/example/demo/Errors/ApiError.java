package com.example.demo.Errors;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ApiError {

    private HttpStatus status;
    private String message;

    public ApiError(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters y setters
}
