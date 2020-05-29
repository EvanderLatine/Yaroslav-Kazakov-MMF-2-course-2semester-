package com.company;

class Person{

    private String name;
    Account account;

    Person(String name, String password, int deposit, int admission, int withdrawal){
        this.name = name;
        account = new Account(password, deposit, withdrawal, admission);
    }
    public void displayPerson(){
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account{
        private String password;
        private int deposit, withdrawal, admission;

        Account(String pass, int deposit, int withdrawal, int admission){
            this.password = pass;
            this.admission = admission;
            this.deposit = deposit;
            this.withdrawal = withdrawal;
        }
        void displayAccount(){
            System.out.println("Account Login: " + Person.this.name + "\tPassword: " + password + "\nDeposit: " + deposit + "\nWithdrawal: " + withdrawal + "\nAdmission: " + admission);
        }
    }
}
