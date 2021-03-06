package com.simplefanc.design.structural.bridge;

/**
 * 定期账户
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户类型");
    }
}
