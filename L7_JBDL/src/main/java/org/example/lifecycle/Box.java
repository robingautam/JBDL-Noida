package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Box implements InitializingBean, DisposableBean {
    int width;
    int height;

    Box(){}

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public void init(){
        System.out.println("initialising fields");
    }

    public void destry(){
        System.out.println("Cleanup Code");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initialising fields: afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cleanup Code: destroy");
    }
}
