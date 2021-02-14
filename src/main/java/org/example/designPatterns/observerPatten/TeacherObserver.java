package org.example.designPatterns.observerPatten;

/**
 * @author matao
 * @date 2021-02-04 15:06
 * @description
 * 再定义观察者：一个老师
 */
public class TeacherObserver implements ObserverInterface {

    @Override
    public void update(Student stu) {
        if(stu.getScore()>80){
            System.out.println("Score="+stu.getScore()+",Teacher:You're brilliant!");
        }else{
            System.out.println("Score="+stu.getScore()+",Teacher:Don't be a chicken!");
        }
    }
}