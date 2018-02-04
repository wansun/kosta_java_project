package step6.relation;

public class Car {
	private String model;
	private Engine engine;
	/*
	 * Car 와 Engine 은 composition 관계이므로
	 * Car 객체 생성전에 Engine 객체 생성하도록 생성자 내에서 처리
	 */
	public Car(String model) {
	this.model=model;
	//엔진 객체를 생성
	this.engine=new Engine("L4",2000);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
