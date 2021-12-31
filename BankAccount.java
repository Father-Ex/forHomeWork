package practice;

public class BankAccount {
    double balance;

    void withdraw(double moneyToWithdraw){
        if(balance<=0 || balance<moneyToWithdraw){
            System.out.println("지갑이 자유분방한 상태다");
        }else{
            balance -= moneyToWithdraw;
            System.out.println(moneyToWithdraw+"원이 인출되었습니다");
        }
    }

    void deposit(double moneyToDeposit){
        balance += moneyToDeposit;
        System.out.println(moneyToDeposit+"원이 입금되었습니다");
    }

    double getBalance(){
        return balance;
    }

    void addInterest(){
        balance *= 1.075;
    }
}
