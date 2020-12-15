package com.example.docport;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class User {
    String uName, pwd, email, ph, addr, dob, uid;
    boolean gender, type;
//    Button register;

    public User(String uName, String pwd, String email, String ph, String addr, String dob, boolean gender, boolean type,/* Button register,*/ String uid) {
        this.uName = uName;
        this.pwd = pwd;
        this.email = email;
        this.ph = ph;
        this.addr = addr;
        this.dob = dob;
        this.gender = gender;
        this.type = type;
//        this.register = register;
        this.uid=uid;
    }

    public User(){

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

//    public Button getRegister() {
//        return register;
//    }
//
//    public void setRegister(Button register) {
//        this.register = register;
//    }
}
