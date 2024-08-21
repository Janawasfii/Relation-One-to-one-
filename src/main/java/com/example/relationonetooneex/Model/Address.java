package com.example.relationonetooneex.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity

public class Address {

     @Id
     private Integer id;

     private String area;

     private String street;

     private Integer buildingNumber;


     @OneToOne
     @MapsId
     @JsonIgnore
     private Teacher teacher;


}
