package order;

import java.time.LocalDateTime;

public class Order {
	private int id;
	private int customerId;
	private String name;
	private LocalDateTime orderDatetime;
	public Order(int id, int customerId, String name, LocalDateTime orderDatetime) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.orderDatetime = orderDatetime;
	}
	public Order() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getOrderDatetime() {
		return orderDatetime;
	}
	public void setOrderDatetime(LocalDateTime orderDatetime) {
		this.orderDatetime = orderDatetime;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", name=" + name + ", orderDatetime=" + orderDatetime
				+ "]";
	}
	
}
