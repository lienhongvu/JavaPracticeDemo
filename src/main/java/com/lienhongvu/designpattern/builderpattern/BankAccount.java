package com.lienhongvu.designpattern.builderpattern;

import com.google.common.base.Strings;

public class BankAccount {

    private final String name;
    private final String accountNumber;

    private BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    static class BankAccountBuilder {
        private String name;
        private String accountNumber;

        BankAccountBuilder withName(String name) {
            this.name = name;
            return this;
        }

        BankAccountBuilder withAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        void validate() {
            if (Strings.isNullOrEmpty(this.name)) {
                throw new IllegalArgumentException("Value for name is missing");
            }

            if (Strings.isNullOrEmpty(this.accountNumber)) {
                throw new IllegalArgumentException("Value for accountNumber is missing");
            }
        }

        BankAccount build() {
            validate();
            return new BankAccount(this);
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccountBuilder().withName("Lien").withAccount("2222-3333-4444").build();
        System.out.println(String.format("Hello %s. Welcome to ABC Bank!", bankAccount.getName()));
    }
}
