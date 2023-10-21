package org.examples.patterns.builder;

import org.example.patterns.builder.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    public void studentObjectBuildingTest(){
        Student student = Student.builder()
                                .setPsp(99.0)
                                .setName("Ashish Gupta")
                                .setRollNum(1)
                                .setEmail("ashish9889@gmail.com")
                                .setAge(25)
                                .build();

        Assertions.assertEquals(student.getAge(), 25);
        Assertions.assertTrue(student.getName().equals("Ashish Gupta"));
        Assertions.assertEquals(student.getPsp(), 99.0);
        Assertions.assertEquals(student.getRollNum(), 1);
        Assertions.assertTrue(student.getEmail().equals("ashish9889@gmail.com"));
    }
}
