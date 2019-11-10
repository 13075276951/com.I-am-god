package com.apple.chaptersix1;

public class Book {

    protected int pages = 300;
    public void setPages(int pages){this.pages = pages;}
    public int getPages(){return pages;}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(){
        this.name = "新华字典";
    }

//    protected double name = xinhua;
//    public void setName(double Name){this.name = name;}
//    public double getName(){return (double) name;}
    }



