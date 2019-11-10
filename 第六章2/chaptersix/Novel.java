package com.apple.chaptersix;

public class Novel extends Book {
    private String novelName;

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public void Novel(){
        super.Book(412,36);
        novelName = "平凡的世界";
    }
}
