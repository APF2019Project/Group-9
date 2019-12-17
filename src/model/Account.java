package model;

import java.util.ArrayList;

public class Account {
    private static Account loggedAccount;
    private static ArrayList<Account> allAccount = new ArrayList<>();
    private String userName;
    private String passWord;
    private ArrayList<Card> allCard;
    private ArrayList<Card> Collection;
    private int killedZombies;
    private int money;

    public Account(String userName, String passWord) {
        allAccount.add(this);
        this.userName = userName;
        this.passWord = passWord;
    }

    public static Account getLoggedAccount() {
        return loggedAccount;
    }

    public static void setLoggedAccount(Account loggedAccount) {
        Account.loggedAccount = loggedAccount;
    }

    public static ArrayList<Account> getAllAccount() {
        return allAccount;
    }

    public static void setAllAccount(ArrayList<Account> allAccount) {
        Account.allAccount = allAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ArrayList<Card> getAllCard() {
        return allCard;
    }

    public ArrayList<Card> getCollection() {
        return Collection;
    }

    public int getKilledZombies() {
        return killedZombies;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setKilledZombies(int killedZombies) {
        this.killedZombies = killedZombies;
    }
}