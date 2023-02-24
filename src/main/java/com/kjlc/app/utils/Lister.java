package com.kjlc.app.utils;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.NoSuchElementException;

import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Student;
import com.kjlc.app.Entity.Test;
import com.kjlc.app.services.StudentService;
import com.kjlc.app.services.TestService;

public class Lister {

    public static List<Dictionary<String,String>> lister(List<Result> results, TestService testService, StudentService studentService){

        Dictionary<String,String> result;
        List<Dictionary<String,String>> resultList = new ArrayList<>();

        for(int i = 0; i < results.size(); i++){

            Result r = results.get(i);
            Student s;
            try{
                s = studentService.retrieveByUserID(r.getUserID()).get();
            }
            catch(NoSuchElementException e){
                s = new Student();
                s.setFirstName("admin");
                s.setLastName("admin");
                s.setBatch("ADMIN");
            }
            
            Test t = testService.retrieve(r.getTestID()).get();

            result = new Hashtable<String,String>();

            result.put("ResultID", String.valueOf(r.getResultID()));
            result.put("Batch", s.getBatch());
            result.put("FirstName", s.getFirstName());
            result.put("LastName", s.getLastName());
            result.put("TestName", t.getTestName());
            result.put("TestID", String.valueOf(t.getTestID()));
            result.put("Score", String.valueOf(r.getScore()));
            result.put("Status", (r.getStatus())?"Pass":"Fail");
            resultList.add(result);
        }
        return(resultList);
    }
}
