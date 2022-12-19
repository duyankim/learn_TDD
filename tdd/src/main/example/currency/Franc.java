package example.currency;

class Franc extends Money{

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return "CHF";
    }
}
