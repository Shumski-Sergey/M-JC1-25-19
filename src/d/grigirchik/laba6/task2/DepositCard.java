package d.grigirchik.laba6.task2;


public class DepositCard extends Cards {
	short cashBack;
	short discountOnlinePurchases;

	public DepositCard(long numberOfCard, String cardHolderName, int cvv, String date, String operator, boolean payWay, short cashBack, short discountOnlinePurchases) {
		super(numberOfCard, cardHolderName, cvv, date, operator, payWay);
		this.cashBack = cashBack;
		this.discountOnlinePurchases = discountOnlinePurchases;
	}

	public void setCashBack(short cashBack) {
		this.cashBack = cashBack;
	}

	public void setDiscountOnlinePurchases(short discountOnlinePurchases) {
		this.discountOnlinePurchases = discountOnlinePurchases;
	}
}
