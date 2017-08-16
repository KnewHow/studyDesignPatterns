package demo;

/**
 * A class to describe personal card information
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public class Card {

	/**
	 * The number of card
	 */
	private String cardNo = "";

	/**
	 * The steady money in card
	 */
	private int steadyMoney = 0;

	/**
	 * The free money in card
	 */
	private int freeMoney = 0;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getSteadyMoney() {
		return steadyMoney;
	}

	public void setSteadyMoney(int steadyMoney) {
		this.steadyMoney = steadyMoney;
	}

	public int getFreeMoney() {
		return freeMoney;
	}

	public void setFreeMoney(int freeMoney) {
		this.freeMoney = freeMoney;
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", steadyMoney=" + steadyMoney + ", freeMoney=" + freeMoney + "]";
	}
	
	

}
