package jp.ac.uryukyu.ie.e245722;

public class Warrior extends Hero {

    public Warrior (String name, int maximumHP, int attack){
        super(name , maximumHP , attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){

        int damage = (int)((1.5)* super.getAttak());
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！",super.getName(),opponent.getName(),damage);
        opponent.wounded(damage);
    }

}
