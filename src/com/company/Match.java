package com.company;

import java.sql.SQLOutput;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

     void run(){
        if(isCheck()){
            double firstHit= Math.random() ;

            int i =1;
            while(this.f1.health>0 && this.f2.health>0){
                System.out.println("----------------- "+i +". ROUND----------------- ");
                if(firstHit<=0.5){
                    //f1 starts
                    this.f2.health=this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    //f2 hits
                    this.f1.health=this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name+" Sağlık: "+this.f1.health);
                    System.out.println(this.f2.name+" Sağlık: "+this.f2.health);
                }
                else{//f2 starts
                    this.f1.health=this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    //f1 hits
                    this.f2.health=this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name+" Sağlık: "+this.f1.health);
                    System.out.println(this.f2.name+" Sağlık: "+this.f2.health);
                }
            i++;
            }

        }
        else{
            System.out.println("Sporcu sikletleri uyumsuz.");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>= minWeight && this.f1.weight<= maxWeight)&&(this.f1.weight>= minWeight && this.f1.weight<= maxWeight);
    }
    boolean isWin(){
       if( this.f1.health==0){
           System.out.println(f2.name+" kazandı");
           return true;
       }
        if( this.f2.health==0){
            System.out.println(f1.name+" kazandı");
            return true;
        }
        return false;
    }
}
