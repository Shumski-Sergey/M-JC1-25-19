package d.grigirchik.laba6.task2;

public class SallaryCard extends Cards {
	String status;
	String privelges;


	public SallaryCard(long numberOfCard, String cardHolderName, int cvv, String date, String operator, boolean payWay, String status, String privelges) {
		super(numberOfCard, cardHolderName, cvv, date, operator, payWay);
		this.status = status;
		this.privelges = privelges;
	}

	public String getStatus() {
		return status;
	}

	public String getPrivelges() {
		return privelges;
	}
}
