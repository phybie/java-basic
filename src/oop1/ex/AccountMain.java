package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        //10000원 입금
        account.deposit(10000);
        //9000원 출금
        account.withdraw(9000);
        //20000원 출금시도
        account.withdraw(20000);
        //잔고 출력
        account.showBalance();
    }
}
