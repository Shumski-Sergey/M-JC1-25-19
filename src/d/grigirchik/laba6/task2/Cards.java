package d.grigirchik.laba6.task2;

public class Cards {
	private long numberOfCard;
	private String cardHolderName;
  private int cvv;
	private String date;
	private String operator;
	private boolean payWay;

	public Cards(long numberOfCard, String cardHolderName, int cvv, String date, String operator, boolean payWay) {
		this.numberOfCard = numberOfCard;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.date = date;
		this.operator = operator;
		this.payWay = payWay;
	}

}
