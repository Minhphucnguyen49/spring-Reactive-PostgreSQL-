package com.example.demoreactive.repository;

import com.example.demoreactive.entities.Plane;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlaneRepository extends ReactiveCrudRepository<Plane, Long> {
}
