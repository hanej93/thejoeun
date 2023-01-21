package customer;

import java.util.List;

import order.Order;

// 데이터베이스에 들어있는 값을 조인해서 하나의 객체안에 다 넣어보자
public class Customer {
	private int id;
	private String name;
	private List<Order> orderList;

	public Customer(int id, String name, List<Order> orderList) {
		super();
		this.id = id;
		this.name = name;
		this.orderList = orderList;
	}

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}
