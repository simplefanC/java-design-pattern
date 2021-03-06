package com.simplefanc.design.structural.bridge;

public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //将银行的账户行为委托给真正的账户行为
        account.openAccount();

        return account;
    }
}
