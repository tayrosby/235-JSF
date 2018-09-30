//Taylor Rosby
//CST -235
//ICA 3

//This file holds order objects

package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {
	
	//creates the list
	List<Order> orders = new ArrayList<Order>();
	
	//hold the orders in the list
	public Orders() {
		
		orders.add(new Order("01", "Product 1", (float)1.00, 1));
		orders.add(new Order("02", "Product 2", (float)2.00, 2));
		orders.add(new Order("03", "Product 3", (float)3.00, 3));
		orders.add(new Order("04", "Product 4", (float)4.00, 4));
		orders.add(new Order("05", "Product 5", (float)5.00, 5));
		orders.add(new Order("06", "Product 6", (float)6.00, 6));
		orders.add(new Order("07", "Product 7", (float)7.00, 7));
		orders.add(new Order("08", "Product 8", (float)8.00, 8));
		orders.add(new Order("09", "Product 9", (float)9.00, 9));
		orders.add(new Order("10", "Product 10", (float)10.00, 10));
	}
	
	//getters and setters to retrieve the list
	public List<Order> getOrders(){
		return orders;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
