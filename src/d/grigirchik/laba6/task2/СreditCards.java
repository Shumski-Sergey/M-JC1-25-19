package d.grigirchik.laba6.task2;

public class СreditCards extends Cards {
	int maxLoanAmount;
	int minLoanAmount;
	byte creditRate;
	int installmentPeriod;
	int maxCreditPeriod;

	public СreditCards(long numberOfCard, String cardHolderName, int cvv, String date, String operator, boolean payWay, int maxLoanAmount, int minLoanAmount, byte creditRate, int installmentPeriod, int maxCreditPeriod) {
		super(numberOfCard, cardHolderName, cvv, date, operator, payWay);
		this.maxLoanAmount = maxLoanAmount;
		this.minLoanAmount = minLoanAmount;
		this.creditRate = creditRate;
		this.installmentPeriod = installmentPeriod;
		this.maxCreditPeriod = maxCreditPeriod;
	}

	public int getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public int getMinLoanAmount() {
		return minLoanAmount;
	}

	public byte getCreditRate() {
		return creditRate;
	}

	public int getInstallmentPeriod() {
		return installmentPeriod;
	}

	public int getMaxCreditPeriod() {
		return maxCreditPeriod;
	}
}
