package applcation;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Principal {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com" ,new Date(), 3000.00, obj);
	
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sellerDao);
		
		
	}

}
