package com.daisuzz.samplevalidator.plain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {


    @NotEmpty
    @Size(max = 20)
    public String firstName;

    @NotEmpty
    @Size(max = 20)
    public String lastName;

    @Max(100)
    @Min(0)
    public Integer age;

    public User(@NotEmpty final String firstName, @NotEmpty final String lastName, @Min(0) final Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }
}
