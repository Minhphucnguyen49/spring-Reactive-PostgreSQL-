package com.example.demoreactive.service;


import com.example.demoreactive.entities.Plane;
import com.example.demoreactive.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class PlaneService {

  private final PlaneRepository planeRepository;

  @Autowired
  public PlaneService(PlaneRepository planeRepository) {
    this.planeRepository = planeRepository;
  }


  public Flux<Plane> findAllPlanes(){

    return planeRepository.findAll();
  }

  public void save(Plane plane){
    planeRepository.save(plane);

  }

}
