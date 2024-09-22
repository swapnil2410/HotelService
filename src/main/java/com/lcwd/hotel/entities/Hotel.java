package com.lcwd.hotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hotels")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hotel {

    private String id;
    private String name;
    private String location;
    private String about;

}
