package ru.netology.Authorization_service;

public enum Authorities {
    READ, WRITE, DELETE;

    @Override
    public String toString() {
        return "Authorities{}";
    }
}
