package com.apple.chaptersix;



public class Magazine extends Book {

    private String publicationCycle;


    public String getPublicationCycle() {
        return publicationCycle;
    }

    public void setPublicationCycle(String publicationCycle) {
        this.publicationCycle = publicationCycle;
    }

    public void Magazine(){
        super.Book(50,15.0);
        publicationCycle = "2019.11.10";
    }


}