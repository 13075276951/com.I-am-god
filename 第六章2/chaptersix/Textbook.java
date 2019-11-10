package com.apple.chaptersix;

public class Textbook extends Book {
    private String Objeect;

    public String getObjeect() {
        return Objeect;
    }

    public void setCourse(String objeect) {
        Objeect = objeect;
    }

    public void Textbook(){
        super.Book(275,45.0);
        Objeect = "学生";
    }


}
