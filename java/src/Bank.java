
class Account {
	private int id;
	private int num;
	private String name;
	private double balance;
	public Account(int id, int num, String name, double balance) {
		this.id = id;
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", num=" + num + ", name=" + name + ", balance=" + balance + "]";
	}
	
public class Bank{
	public static void main(String[] args) {
		
	}
}


}
