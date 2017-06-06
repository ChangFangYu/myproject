package oo.shopping2;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList();
		list.add(new NormalCustomer());
		list.add(new NormalCustomer());
		list.add(new SilverCustomer());
		list.add(new GoldenCustomer());
		list.add(new NormalCustomer());
		list.add(new SilverCustomer());
	}

}
