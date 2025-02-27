package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount){
        balance += amount;
        System.out.println(amount +"원이 입금되었습니다.");
    }

    void withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액부족, 출금불가");
        }else {
            balance -= amount;
        }
    }

    void showBalance(){
        System.out.println("현재 잔고 " + balance +"원");
    }
}
