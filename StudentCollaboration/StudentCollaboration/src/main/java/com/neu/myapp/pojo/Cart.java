package com.neu.myapp.pojo;

import java.awt.List;

public class Cart {
	
	private int cartId;
	private int personId;
	private List cartList;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public List getCartList() {
		return cartList;
	}

	public void setCartList(List cartList) {
		this.cartList = cartList;
	}
	

}
