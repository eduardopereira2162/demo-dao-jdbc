package applcation;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Principal {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===TEST 1: seller findByid");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n===TEST 2: seller findByDepartament ");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartament(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
