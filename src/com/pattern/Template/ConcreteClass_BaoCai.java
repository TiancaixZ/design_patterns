package com.pattern.Template;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-01
 **/
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
