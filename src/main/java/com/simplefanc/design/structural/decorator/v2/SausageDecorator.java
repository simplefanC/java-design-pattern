package com.simplefanc.design.structural.decorator.v2;

/**
 * 具体的装饰角色
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
