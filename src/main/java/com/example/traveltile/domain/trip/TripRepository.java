package com.example.traveltile.domain.trip;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Slf4j
public class TripRepository {

    private final Map<Long, Trip> store = new HashMap<>();
    private static long sequence = 0L;

    public Trip save(Trip trip) {
        trip.setId(++sequence);
        store.put(trip.getId(), trip);
        return trip;
    }

    public Trip findById(Long id) {
        Trip trip = store.get(id);
        if (trip == null) {
            throw new NoSuchElementException("해당 여행정보가 없습니다. id=" + id);
        };
        return trip;
    }

    public void update(Long id, Trip updateParam) {
        Trip findTrip = findById(id);
        findTrip.setDestination(updateParam.getDestination());
        findTrip.setStatus(updateParam.getStatus());
        findTrip.setTitle(updateParam.getTitle());
        findTrip.setStart_date(updateParam.getStart_date());
        findTrip.setEnd_date(updateParam.getEnd_date());
        findTrip.setIsDomestic(updateParam.getIsDomestic());
    }

    public List<Trip> findAll() {
        return new ArrayList<>(store.values());
    }
}
