package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String firstName,
            lastName,
            address,
            address2,
            email,
            password,
            city,
            state,
            zipCode;

    //Thymeleaf accepts yyy-MM-dd ,but local date mm-dd-yyyy or yyyy-dd-mm
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;
}
