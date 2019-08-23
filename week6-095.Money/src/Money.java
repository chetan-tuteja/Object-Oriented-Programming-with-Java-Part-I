
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money test = new Money(this.euros + added.euros, this.cents + added.cents);
        return test;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        Money test;
        if (this.less(decremented)) {
            return test = new Money(0, 0);
        }
        if (this.cents < decremented.cents) {
            return test = new Money((this.euros - decremented.euros) - 1, (100 - decremented.cents));
        }
        return test = new Money(this.euros - decremented.euros, this.cents - decremented.cents);

    }

}
