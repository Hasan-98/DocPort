package com.example.docport;

public class booking_model {
    String doctor,tn,charges;

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public booking_model(String doctor, String tn, String charges) {
        this.doctor = doctor;
        this.tn = tn;
        this.charges = charges;
    }
}
