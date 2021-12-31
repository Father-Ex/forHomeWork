package practice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(100);
        b.withdraw(60);
        System.out.printf("현재 잔고는 %.1f원 입니다\n",b.getBalance());
        b.addInterest();
        System.out.printf("7.5%%의 이자가 추가되어 현재 잔액이 %.1f원이 되었습니다\n",b.getBalance());
        b.withdraw(b.getBalance()); //전액인출
        //b.withdraw(b.getBalance()+500); //잔액을 초과한 인출
        System.out.printf("현재 잔고는 %.1f원 입니다\n",b.getBalance());
    }
}
