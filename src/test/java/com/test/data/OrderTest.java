package com.test.data;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testAdd() throws Exception {
		Order o = mockOrder();
		assertEquals(o.getOrderLines().size(), 1);
	}

	private Order mockOrder() throws Exception {
		Order o = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		o.setOrderLines(orderLines);
		
		Item i = new Item("desc", 1.23f);
		OrderLine ol = new OrderLine(i, 1);
		o.add(ol);
		return o;
	}

	@Test
	public void testSize() throws Exception {
		assertEquals(mockOrder().size(), 1);
	}

	@Test
	public void testGet() throws Exception {
		assertEquals(mockOrder().get(0).getQuantity(), 1);
	}

	@Test
	public void testClear() throws Exception {
		Order mockOrder = mockOrder();
		mockOrder.clear();
		assertEquals(mockOrder.size(), 0);
	}
	

}
