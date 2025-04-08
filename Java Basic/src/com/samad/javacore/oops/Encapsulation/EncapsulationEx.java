package com.samad.javacore.oops.Encapsulation;

public class EncapsulationEx {
    public static void main(String[] args) {
        Student student = new Student("Samad", 12, 124356);
//        student.setAge(-12);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollNumber());

      /*  BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(200);
        bankAccount.deposit(1500);
        bankAccount.withdraw(800);
        bankAccount.deposit(-100);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getBalance());*/
    }
}
