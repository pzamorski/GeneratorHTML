package org.example.elemts.thymeleaf.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String marka;
    private String model;
    private String user;
    private String adres;
}
