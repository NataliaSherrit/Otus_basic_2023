package homework_13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Bank {

    private final static Map<Client, List<Account>> storageForClients = new HashMap<>();
    private final static Map<Account, Client> storageForAccounts = new HashMap<>();

    public static void main(String[] args) {
        storageForClients.put(
                new Client("Ivanov", 45),
                List.of(new Account("123456"),
                        new Account("654321")));
        storageForClients.put(
                new Client("Petrov", 27),
                List.of(new Account("111111"),
                        new Account("222222"),
                        new Account("333333")));

        storageForAccounts.put(
                new Account("123456"), new Client("Ivanov", 45));
        storageForAccounts.put(
                new Account("654321"), new Client("Ivanov", 45));
        storageForAccounts.put(
                new Account("111111"), new Client("Petrov", 27));
        storageForAccounts.put(
                new Account("222222"), new Client("Petrov", 27));
        storageForAccounts.put(
                new Account("333333"), new Client("Petrov", 27));


        // поиск всех счетов клиента
        try {
            storageForClients.get(new Client("Ivanov", 45)).forEach(i -> System.out.println(i.getBankId()));
        } catch (NullPointerException e) {
            System.out.println("такого клиента не существует!");
        }

        // поиск клиента по номеру счета
        try {
            System.out.println(findClient(new Account("111111")).toString());
        } catch (NullPointerException e) {
            System.out.println("такого счета не существует!");
        }

    }
    private static Client findClient(Account account) {
        return storageForAccounts.getOrDefault(account, null);
    }
}

