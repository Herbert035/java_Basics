package org.example.designPatterns.observerPatten;

/**
 * @author matao
 * @date 2021-02-04 15:07
 * @description
 */
public class TestObserver {

    public static void main(String[] args) {
        ObserverInterface pob = new ParentOberver();
        ObserverInterface tob = new TeacherObserver();

        ObserverGen.oi.add(pob);
        ObserverGen.oi.add(tob);

        (new Student()).changeScore();
    }

}
