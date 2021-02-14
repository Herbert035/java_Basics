package org.example.designPatterns.observerPatten;

import java.util.Iterator;
import java.util.Random;

/**
 * @author matao
 * @date 2021-02-04 15:04
 * @description
 */
public class Student {

    private int score;

    public void changeScore(){
        score = (new Random()).nextInt(100);
        notifyObserver();
    }

    public int getScore() {
        return score;
    }

    private void notifyObserver(){
        if(ObserverGen.oi!=null && !ObserverGen.oi.isEmpty()){
            Iterator<ObserverInterface> e = ObserverGen.oi.iterator();
            while(e.hasNext()){
                e.next().update(this);
            }
        }
    }
}
