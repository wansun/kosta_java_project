package step3;

public class CreditCard2 {
	//instance variable
	private String customerInfo;
	//생성자 constructor 
	// customerInfo를 전달 받을 때만 객체 생성 가능하게 정의
	public CreditCard2(String customerInfo) {
		this.customerInfo=customerInfo;
	}
	public String getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}
	
}
