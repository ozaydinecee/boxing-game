package com.company;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;//bloklama şansını hesaplamak için

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge>=0 && dodge<=100){
            this.dodge = dodge;
        }

    }

    int hit(Fighter foe){//hasar alan dövüscü
        System.out.println(this.name+ "=>"+foe.name+" "+this.damage+ " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name+ " gelen hasarı blokladı.");
            System.out.println("--------");
            return foe.health;
        }

        if(foe.health-this.damage<0){
            return 0;
        }
        return foe.health- this.damage;
    }
    boolean isDodge(){
        double dodgeChange = (Math.random()*100);

        return dodgeChange <= this.dodge;
    }
}
