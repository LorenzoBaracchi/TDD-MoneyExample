public class Dollar {

    int amount = 10;

    public Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }
}
