package src;

import lt.itakademija.exam.*;

import java.util.HashMap;
import java.util.Map;

public class BankImpl implements Bank {

    private final Map<PersonCode, Customer> customers = new HashMap<>();
    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {

        if (personCode == null || personName == null) {
            throw new NullPointerException("Code or  name can't be null");
        }

        if (customers.containsKey(personCode)) {
            throw new CustomerCreateException("Customer already exists");
        }

        Long id = 0L;
        Customer newCustomer = new Customer(id,personCode, personName);


        customers.put(personCode, newCustomer);


        return newCustomer;



    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (customer == null || currency == null) {
            throw new NullPointerException("Customer and Currency cannot be null.");
        }

        if (!isCustomerBelongsToBank(customer)) {
            throw new AccountCreateException("The customer does not belong to this bank.");
        }
        long accountId = generateUniqueAccountId();

        Money balance = null;
        Account newAccount = new Account(accountId, customer, currency,balance);

        customer.addAccount(newAccount);

        return newAccount;
    }

    private int generateUniqueAccountId() {
        return 0;
    }

    private boolean isCustomerBelongsToBank(Customer customer) {
        return false;
    }


    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        return null;
    }

    @Override
    public Money getBalance(Currency currency) {
        return null;
    }

}
