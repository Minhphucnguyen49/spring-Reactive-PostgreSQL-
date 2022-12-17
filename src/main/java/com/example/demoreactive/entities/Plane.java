package com.example.demoreactive.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@RequiredArgsConstructor
@Table(schema = "public")
public class Plane {

  @Id
  private Long id;


  @Column("registration_number")
  private final String registrationNumber;


  @Column("model_type")
  private final String modelType;


  @Column()
  public void doSth(){

  }



}
