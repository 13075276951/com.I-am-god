package com.apple.chaptersix;

import java.util.Random;

public class BookServiceImpl implements BookService {


    @Override
    public void makebooks() {
        int i;
        Random rand = new Random();
        i = rand.nextInt(3);
        switch (i) {
            case 0:
                System.out.println("为您推荐的读物是：" + "Magazine");
                Magazine magazine = new Magazine();
                magazine.Magazine();
                System.out.println("该书的页数和价格分别为：" + magazine.pages + " " + magazine.price);
                System.out.println("该杂志的出版周期为：" + magazine.getPublicationCycle());
                break;
            case 1:
                System.out.println("为您推荐的读物是：" + "Novel");
                Novel novel = new Novel();
                novel.Novel();
                System.out.println("该书的页数和价格分别为：" + novel.pages + " " + novel.price);
                System.out.println("该小说名为：" + novel.getNovelName());
//                System.out.println("该书的页数和价格分别为：" + Novel.Pages + " " + Novel.price);
                break;
            case 2:
                System.out.println("为您推荐的读物是：" + "Textbook");
                Textbook textbook = new Textbook();
                textbook.Textbook();
                System.out.println("该书的页数和价格分别为：" + textbook.pages + " " + textbook.price);
                System.out.println("该课本适合的对象为：" + textbook.getObjeect());
                break;
        }
    }

    @Override
    public void showbooks() {

    }
}

