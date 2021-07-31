package com.pattern.Bridge;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-29
 **/
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件:" + fileName);
    }
}
