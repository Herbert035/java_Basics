package org.example.designPatterns.observerPatten;

/**
 * @author matao
 * @date 2021-02-04 15:06
 * @description
 * 再定义观察者：一个是家长
 */
public class ParentOberver implements ObserverInterface{

    @Override
    public void update(Student stu) {
        if(stu.getScore()>80){
            System.out.println("Score="+stu.getScore()+",Parent:^_^");
        }else{
            System.out.println("Score="+stu.getScore()+",Parent:>_<");
        }
    }

}