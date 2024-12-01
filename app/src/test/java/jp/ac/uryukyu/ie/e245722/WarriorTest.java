package jp.ac.uryukyu.ie.e245722;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * ダメージが1.5倍かどうかを確認
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力の1.5倍の3倍の体力のスライムを用意。
     *  (2) ヒーローが殴り、敵も殴る。敵にattackの1.5倍のダメージを与えていることを期待。
     *  (3) きちんとスキルの与ダメが1.5倍されていれば、敵に与えたダメージ＝attack*1.5となる。
     * 
     */
    @Test
    void attackTest() {
        int defaultEnemyHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", 100, 10);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 100);
        for (int i = 0 ; i < 3 ; i++){
            demoHero.attackWithWeponSkill(slime);
            assertEquals(defaultEnemyHp - slime.getHitPoint(), (int)(demoHero.getAttak() * 1.5 * (i+1)) );
    }
        slime.attack(demoHero);
    }
}
