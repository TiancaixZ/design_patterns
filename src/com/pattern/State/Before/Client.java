package com.pattern.State.Before;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-05
 **/
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);//电梯是停止的
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}
