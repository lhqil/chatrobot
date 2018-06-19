package test;

import javafx.geometry.HPos;

import javax.json.Json;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lihanqing3 on 2018/5/31.
 */
public class TestThread {
    public static void main(String[] args) {


        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 400;
        gareen.damage = 10;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 700;
        teemo.damage = 10;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 1200;
        bh.damage = 10;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 100;
        leesin.damage = 10;

       /* Thread t1= new Thread(){
            public void run(){

                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //临时暂停，使得t1可以占用CPU资源
                    Thread.yield();
                    bh.attackHero(leesin);
                }
            }
        };

        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();*/

        List<Hero> list = new ArrayList<>();
        list.add(gareen);
        list.add(teemo);
        list.add(bh);
        list.add(leesin);
        for (Hero h : list) {
            System.out.println(h.toString());
        }
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                if (o1.hp > o2.hp) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(list, c);
        System.out.println("排序后");
        for (Hero h : list) {
            System.out.println(h.toString());
        }
    }
}
