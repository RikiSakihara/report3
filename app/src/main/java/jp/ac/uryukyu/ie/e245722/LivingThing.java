package jp.ac.uryukyu.ie.e245722;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
    }

    //相手を攻撃する
    public void attack(LivingThing opponent){
        if (0 < hitPoint){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent, damage);
            opponent.wounded(damage);
        }
    }

    //相手が倒れたかどうか判断
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * Nameのゲッターメソッド。
     * @return　name
     */
    public String getName() {
        return name;
    }

    /**
     * Deadのゲッターメソッド。
     * @return dead
     */
    public boolean isDead(){
        return dead;
    }

    /**
     * Deadのセッターメソッド
     * @return　dead
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

    /**
     * hitPointフィールドのゲッターメソッド。
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * hitPointのセッターメソッド
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * attackのゲッターメソッド
     */
    public int getAttak(){
        return attack;
    }
}
