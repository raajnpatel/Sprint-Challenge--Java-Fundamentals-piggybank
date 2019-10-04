package local.piggyBank;

public class Nickel extends Money {
    private double value = 0.05;
    private int coinQuantity = 0;
    private double totalCost = 0;

    public Nickel() {
        coinQuantity = 1;
        totalCost = 0.05;
    }

    public Nickel(int coinsAdded) {
        coinQuantity = coinQuantity + coinsAdded;
        totalCost = coinsAdded * value;
    }

    public String getCoinQuantity() {
        return (coinQuantity == 1) ? "1 Nickel" : coinQuantity + " Nickels";
    }

    public double getTotalCost() {
        return totalCost;
    }
}