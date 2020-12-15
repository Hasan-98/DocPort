package com.example.docport;

public class history_model {
    String text1,price;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public history_model(String text1, String price) {
        this.text1 = text1;
        this.price = price;
    }
}
