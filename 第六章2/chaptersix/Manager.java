package com.apple.chaptersix;

public class Manager {
    public static void main(String[] args){
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.makebooks();
        bookService.showbooks();
    }
}
