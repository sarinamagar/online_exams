package com.kjlc.app;


import java.sql.Date;
import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.kjlc.app.repository.TestRepository;

@DataJpaTest
public class TestRepositoryTest {
    

    @Autowired
    private TestRepository testRepository;

    @Test
    public void saveTest(){
        com.kjlc.app.Entity.Test test = new com.kjlc.app.Entity.Test();
        test.setLevel(1);
        test.setTestName("New Test");
        test.setTestDate(Date.valueOf(LocalDate.now()));
        testRepository.save(test);

        Assertions.assertThat(test.getTestID().equals(0));
    }

}
