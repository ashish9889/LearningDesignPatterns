package org.example.patterns.builder;

public class Builder {
    public static void main(String[] args) {
        Student student = Student.builder()
                                .setPsp(99.0)
                                .setName("Ashish Gupta")
                                .setRollNum(1)
                                .setEmail("ashish9889@gmail.com")
                                .setAge(25)
                                .build();

    }
}
