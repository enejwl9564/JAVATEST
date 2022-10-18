package TEST07;

class Buyer{
	int myMoney, appleCnt;
	void pay(Seller seller, int money) {
		myMoney -= money;
		int cnt = seller.retrunapple(money);
		appleCnt += cnt;
	}
	@Override
	public String toString() {
		return "buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
}

class Seller{
	int myMoney, appleCnt, price;

	int retrunapple(int money) {
		myMoney += money;
		int cnt = money/price;
		appleCnt -= cnt;
		return cnt;
	}
	
	@Override
	public String toString() {
		return "seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}

	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
}

public class T03AppleMain {

	public static void main(String[] args) {
		Seller seller = new Seller(10000,100,1000);
		Buyer buyer = new Buyer(5000,0);
		buyer.pay(seller,2000);
		System.out.println(seller);
		System.out.println(buyer);

	}

}
