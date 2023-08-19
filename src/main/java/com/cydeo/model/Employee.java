package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

//    @NotNull   ---> Field shouldn't be null
//    @NotEmpty  ---> Field shouldn't be ""
//    @NotBlank  ---> Field shouldn't be "       "

//    @NotNull   --> @NotNull
//    @NotEmpty  --> @NotNull + @NotEmpty
//    @NotBlank  --> @NotNull + @NotEmpty + @NotBlank

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;

    @NotBlank
    @Size(max = 12, min = 2)
    private String lastName;

    private String address;
    private String address2;

//    @NotBlank
//    @Email
    private String email;

//    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String city;
    private String state;
    private String zipCode;

    //Thymeleaf accepts yyy-MM-dd ,but local date mm-dd-yyyy or yyyy-dd-mm
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate birthDay;
}
