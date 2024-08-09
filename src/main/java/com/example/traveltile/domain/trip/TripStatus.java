package com.example.traveltile.domain.trip;

public enum TripStatus {

    PLAN("계획"), PROCEED("진행"), COMPLETE("완료"), CANCEL("취소");

    private final String description;

    TripStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
