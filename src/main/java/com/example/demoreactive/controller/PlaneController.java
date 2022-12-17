package com.example.demoreactive.controller;

import com.example.demoreactive.entities.Plane;
import com.example.demoreactive.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("api/v1/plane")
@RequiredArgsConstructor
public class PlaneController {

  private final PlaneService planeService;


  @GetMapping("/get-all")
  public Flux<Plane> getAllPlanes(){
    return planeService.findAllPlanes();
  }



}
