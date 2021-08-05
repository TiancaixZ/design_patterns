package com.pattern.responsibility;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-04
 **/
public class Manger extends Handler{

    public Manger() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
