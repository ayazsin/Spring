package bank;

public class BankLoan {
    private int amount;
    private int monthsNb;
    private double rate;
    private int monthlyPaiment;
    private double bankbenefit;

    public BankLoan(int amount, int monthsNb, double rate) {
        this.amount = amount;
        this.monthsNb = monthsNb;
        this.rate = rate;

    }

    public void calculBankBenfit() {
        this.monthlyPaiment = (int)((amount * (rate / 12)) / (1 - (Math.pow( ( 1 + (rate / 12)), monthsNb*(-1)))) );
        this.bankbenefit = monthlyPaiment * monthsNb - amount;
    }

    @Override
    public String toString() {
        return "BankLoan{" +
                "amount=" + amount +
                ", monthsNb=" + monthsNb +
                ", rate=" + rate +
                ", monthlyPaiment=" + monthlyPaiment +
                ", bankbenefit=" + bankbenefit +
                '}';
    }
}
