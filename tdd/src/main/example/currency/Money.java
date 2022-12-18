package example.currency;

abstract class Money {
    abstract Money times(int mulitplier);
    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
