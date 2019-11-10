package com.apple.chaptersix1;

public class Words {
    public static void main(String[] args){
        Dictionary xinhua = new Dictionary();
        xinhua.setName();
        System.out.println("书名:"+xinhua.getName());
        System.out.println("书页:"+xinhua.getPages());
        System.out.println("词条数:"+xinhua.getDefinitions());
        System.out.println("每页词条数:"+xinhua.computerRatio());
    }
}
