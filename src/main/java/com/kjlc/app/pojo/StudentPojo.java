package com.kjlc.app.pojo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentPojo {
    
    Long studentID;
    Long userID;
    Integer level;
    Integer tests;

    @NotEmpty(message = "Batch can't be empty")
    String batch;

    @NotEmpty(message = "First Name can't be empty")
    String FirstName;

    String LastName;

    @NotEmpty(message = "Address can't be empty")
    String Address;

    @NotEmpty(message = "ContactNumber can't be empty")
    Long ContactNumber;

    @NotEmpty(message = "DOB can't be empty")
    Date DOB;
}
