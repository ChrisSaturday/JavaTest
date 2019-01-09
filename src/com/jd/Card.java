package com.jd;

public class Card {
    private String bank; //发卡行
    private String pwd; //密码
    private double bal; //余额

    /**
     * function: 带参的构造方法
     * @param bank: 发卡行
     * @param pwd: 卡密码
     * @param bal: 卡余额
     */
    public Card(String bank, String pwd, double bal) {
        this.bank = bank;
        this.pwd = pwd;
        this.bal = bal;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
