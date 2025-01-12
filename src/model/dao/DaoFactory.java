package model.dao;

import model.dao.mpl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
			
	}
}
