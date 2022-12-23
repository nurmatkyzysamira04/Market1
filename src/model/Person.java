package model;

public class Person {
    private long id;
    private String name;
    private int bankAccount;

    public Person(long id, String name, int bankAccount) {
        this.id = id;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +"\n"+
                ", name='" + name + "\n" +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
