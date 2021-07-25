package com.pattern.Prototype;

import java.io.*;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-25
 **/
public class CitationTest {
    public static void main(String[] args) {
        Citation citation = new Citation();
        Student student = new Student("张三", "南京");
        citation.setStu(student);

        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/chenguozhen/Downloads/b.txt"));
            objectOutputStream.writeObject(citation);

            objectInputStream = new ObjectInputStream(new FileInputStream("/Users/chenguozhen/Downloads/b.txt"));
            Citation citation1 = (Citation) objectInputStream.readObject();
            Student stu = citation1.getStu();
            stu.setName("李四");

            System.out.println("stu和stu1是同一个对象？" + (student == stu));
            citation.show();
            citation1.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
