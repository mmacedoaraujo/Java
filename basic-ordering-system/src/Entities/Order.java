package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;

	private List<OrderItem> orderItem = new ArrayList<>();
	private Client client;

	Order() {

	}

	public Order(Date moment, OrderStatus status, Client clientName) {
		this.moment = moment;
		this.status = status;
		this.client = clientName;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void addItem(OrderItem orderItem) {
		this.orderItem.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		this.orderItem.remove(orderItem);
	}

	public Double total() {
		double sum = 0;
		for (OrderItem a : orderItem) {
			sum += a.subTotal();

		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail()
				+ "\n");
		sb.append("\nITEMS ORDERED:\n");
		for (OrderItem c : orderItem) {

			sb.append(c);
		}
		sb.append("\nTotal: $" + String.format("%.2f", total()));
		return sb.toString();
	}

}