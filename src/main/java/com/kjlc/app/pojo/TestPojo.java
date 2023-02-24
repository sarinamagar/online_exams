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

public class TestPojo {
    Long TestID;

    @NotEmpty(message = "Test Name can't be empty")
    String TestName;

    @NotEmpty(message = "Test Date can't be empty")
    Date TestDate;

    @NotEmpty(message = "Test level can't be empty")
    Integer level;
}
