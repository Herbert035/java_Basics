package org.example.designPatterns.abstractFactoryPatten;

/**
 * @author matao
 * @date 2021-02-04 15:37
 * @description
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制 Python 视频");
    }
}
