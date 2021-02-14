package org.example.designPatterns.abstractFactoryPatten;

/**
 * @author matao
 * @date 2021-02-04 15:35
 * @description
 */
public class PythonCourseFactory implements  CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
