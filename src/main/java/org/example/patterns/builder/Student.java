package org.example.patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student {
    private String name;
    private Integer rollNum;
    private String email;
    private Double psp;
    private Integer age;

    private Student(Builder builder){
        this.setEmail(builder.email);
        this.setName(builder.name);
        this.setPsp(builder.psp);
        this.setRollNum(builder.rollNum);
        this.setAge(builder.age);
    }

    //Provides Builder object to create Student object
    public static Builder builder(){
        return new Student.Builder();
    }
    @Getter
    public static class Builder{
        private String name;
        private Integer rollNum;
        private String email;
        private Double psp;
        private int age;

        //Builds Student object after performing validations
        public Student build(){
            if(this.age < 5){
                throw new IllegalArgumentException("Invalid age for a student!");
            }
            return new Student(this);
        }

        public Builder setRollNum(Integer rollNum) {
            this.rollNum = rollNum;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int i) {
            this.age = i;
            return this;
        }
    }
}
