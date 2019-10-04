package local.piggyBank;

public class Penny extends Money {
    private double value = 0.01;
    private int coinQuantity = 0;
    private double totalCost = 0;

    public Penny() {
        coinQuantity = 1;
        totalCost = 0.01;
    }

    public Penny(int coinsAdded) {
        coinQuantity = coinQuantity + coinsAdded;
        totalCost = coinsAdded * value;
    }

    public String getCoinQuantity() {
        return (coinQuantity == 1) ? "1 Penny" : coinQuantity + " Pennies";
    }

    public double getTotalCost() {
        return totalCost;
    }
}