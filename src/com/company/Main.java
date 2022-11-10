package com.company;

public class Main {

    public static void main(String[] args) {
	Fighter f1 = new Fighter("Jack",10,120,100,70);
    Fighter f2 = new Fighter("Jones",20,85,85,40);

    Match match=new Match(f1,f2,90,100);
    match.run();


    }
}
