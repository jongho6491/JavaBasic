package account;

public class Account {
    private String accountNumber; // 계좌번호
    private String owner;         // 계좌주
    private int balance;          // 잔액

    public Account(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int amount) {
        balance += amount;
    }

    // 출금
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return accountNumber + " | " + owner + " | " + balance + "원";
    }
}
