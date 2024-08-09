package com.example.traveltile.domain.trip;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 여행 테이블
 */
@Setter
@Getter
@ToString
public class Trip {

    private Long id;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private String destination;
    private String title;
    private Boolean isDomestic;
    private TripStatus status;

    public Trip() {
    }

    public Trip(LocalDateTime start_date, LocalDateTime end_date, String destination, String title, Boolean isDomestic) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.destination = destination;
        this.title = title;
        this.isDomestic = isDomestic;
        this.status = TripStatus.PLAN;
    }
}
