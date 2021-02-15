package com.gourianova.binocularvision.trainer;

public class Email {
    private int id;
    private AppTrainer appTrainer;

    public Email(AppTrainer appTrainer) {
        this.id = 1;
        this.appTrainer = appTrainer;
    }

    @Override
    public String toString() {
        return "user's e'mail id " + id + " " + appTrainer.runApp();
    }
}
