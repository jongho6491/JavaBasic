package BankApplication;

import java.util.Scanner;

import account.Account;

public class BankApplication {

    static Account[] accounts = new Account[100]; // 계좌 배열
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("\n---------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 0.종료");
            System.out.println("---------------------------------------");
            System.out.print("선택> ");

            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    listAccounts();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "0":
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }

        scanner.close();
    }

    // 계좌 생성
    private static void createAccount() {
        System.out.println("[계좌 생성]");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();

        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(accountNumber, owner, balance);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록 출력
    private static void listAccounts() {
        System.out.println("[계좌 목록]");

        for (Account acc : accounts) {
            if (acc != null) {
                System.out.println(acc.toString());
            }
        }
    }

    // 예금
    private static void deposit() {
        System.out.println("[예금]");

        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();

        System.out.print("입금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account acc = findAccount(accountNumber);

        if (acc != null) {
            acc.deposit(money);
            System.out.println("입금이 완료되었습니다.");
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    // 출금
    private static void withdraw() {
        System.out.println("[출금]");

        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();

        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account acc = findAccount(accountNumber);

        if (acc != null) {
            if (acc.withdraw(money)) {
                System.out.println("출금이 완료되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    // 계좌번호로 계좌 찾기
    private static Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc != null && acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}