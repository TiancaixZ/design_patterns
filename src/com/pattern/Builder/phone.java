package com.pattern.Builder;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-25
 **/
public class phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private phone(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    public final static class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public phone build(){
            return new phone(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "cpu='" + cpu + '\'' +
                    ", screen='" + screen + '\'' +
                    ", memory='" + memory + '\'' +
                    ", mainboard='" + mainboard + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
