package ru.netology.Authorization_service;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials( String msg) {
        super(msg);
    }
}
