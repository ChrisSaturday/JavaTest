package com.jd;

public interface IUnionPay {
    /**
     * function: 验证密码
     * @param input: 用户输入的密码
     * @return 是否正确
     * author: Chris
     */
    public abstract boolean checkPwd(String input);

    /**
     * function: 取钱
     * @param money: 取钱的金额
     * @return 是否取钱成功
     * author: Chris
     */
    public abstract boolean drawMoney(double money);

    /**
     * function: 查询余额
     * @return 余额
     */
    public abstract double getBalance();
}
