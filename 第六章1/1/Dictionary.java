package com.apple.chaptersix1;

public class Dictionary extends Book{
    private int definitions = 5000;
    public double computerRatio(){return definitions/pages;}
    public void setDifinitions(int difinitions){
        this.definitions = definitions;
    }
    public int getDefinitions(){return definitions;}


}
