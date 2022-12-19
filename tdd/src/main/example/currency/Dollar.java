package example.currency;

class Dollar extends Money{
    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
