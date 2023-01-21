package test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import customer.Customer;
import mapper.CustomerWithOrders;
import order.Order;
import service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class OrderTest {

	@Autowired
	CustomerWithOrders customerWithOrders;
	
	@Autowired
	CustomerService CustomerService;
	
	@Test @Ignore
	public void test() {
		//assertNotNull(customerWithOrders);
		
		Customer c = customerWithOrders.selectCustomerWithOrders(3);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println("-------주문내역-------");
		for(Order o : c.getOrderList()) {
			System.out.println(o.getId());
			System.out.println(o.getName());
			System.out.println(o.getOrderDatetime());
			System.out.println("--------------------");
		}
	}
	
	
	@Test @Ignore
	public void insertTest() {
		Order order = new Order(0, 2, "과자", LocalDateTime.now());
		int affectedRows = customerWithOrders.insertOrder(order);
		System.out.println(affectedRows + "개의 Row(s)가 영향을 받았습니다.");
		// 객체에 0으로 넣어줬는데 key로써 값을 알아서 세팅해줌
		System.out.println(order);
		
	}
	
	@Test
	public void deleteTest() {
		try {
			CustomerService.deleteCustomerAndOrders(2);
		} catch (Exception e) {
			System.out.println("예외");
			e.printStackTrace();
		}
	}

}
