package com.pattern.Adapter.object_Adapter;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class SDAdapterTF implements SDCard {

    private TFCardImpl tfCard = new TFCardImpl();

    public SDAdapterTF(TFCardImpl tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.write(msg);
    }
}
