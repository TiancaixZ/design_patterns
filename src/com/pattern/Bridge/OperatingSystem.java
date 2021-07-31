package com.pattern.Bridge;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-29
 **/
public abstract class OperatingSystem {
    protected VideoFile file;

    public OperatingSystem(VideoFile file) {
        this.file = file;
    }

    public abstract void play(String fileName);
}
