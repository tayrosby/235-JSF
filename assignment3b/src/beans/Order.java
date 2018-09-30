//Taylor Rosby
//CST -235
//ICA 3

//This file creates an object

package beans;


public class Order {
	
	String orderNo = "";
	String productName = "";
	float price = 0;
	int quantity = 0;
	
	//constructor
	public Order(String orderNo, String productName, float price, int quantity) {
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	//The getters and setters allow for the data to be passed from the form to the response
	public String getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
