package homework_13;

import java.util.Objects;

public class Account {
    private final String bankId;

    public Account(String bankId) {
        this.bankId = bankId;
    }

    public String getBankId() {
        return bankId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(bankId, account.bankId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankId);
    }

}
