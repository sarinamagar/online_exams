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
public class QuestionsPojo {
    
    Long questionID;
    Long TestID;

    @NotEmpty(message = "Question Text can't be empty")
    String questionText;


    String optionA;

    String optionB;

    String optionC;

    String optionD;

    @NotEmpty(message = "Correct Option can't be empty")
    String correctOption;


    String audio;
    
    String image;

}
