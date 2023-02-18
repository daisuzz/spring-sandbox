package com.daisuzz.samplepropertyeditor.controller;

import jakarta.validation.constraints.NotNull;

public class PersonForm {

    @NotNull
    private Integer age;

    @NotNull
    private Boolean canVote;

    public PersonForm() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Boolean getCanVote() {
        return canVote;
    }

    public void setCanVote(final Boolean canVote) {
        this.canVote = canVote;
    }
}
