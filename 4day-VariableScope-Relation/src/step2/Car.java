package step2;

public class Car {
	private String model;
	private int price=1;
	private String color;
	private boolean flag;
	private int carNum;
	public Car(String model,int price) {
		this.model=model;
		this.price=price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
}
