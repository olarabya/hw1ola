package softhw1;

import java.util.ArrayList;

public class muyclassshop {

	
	public	ArrayList books = new ArrayList();
	public int count=0;
	private int total_price=0;

	


public int getcount()
{
	return this.count;
}

public int getprice()
{
	return this.total_price;
}


public void addlist_book(int price, String name) {
	// TODO Auto-generated method stub
	
	if (books.contains(""+name+","+price)) {
		
		System.out.println(""+name+","+price+"founded");
	}
	else {
		books.add(""+name+","+price);
		this.count=count+1;
	this.total_price+=price;
	System.out.println(count);
	}
}

	
	
}
