package com.pattern.Bridge;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-29
 **/
public class Mac extends OperatingSystem{
    public Mac(VideoFile file) {
        super(file);
    }

    @Override
    public void play(String fileName) {
        file.decode(fileName);
    }
}
