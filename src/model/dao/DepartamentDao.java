package model.dao;

import java.util.List;

public interface DepartamentDao {

	
	void insert(DepartamentDao obj);
	void update(DepartamentDao obj);
	void deleteById(DepartamentDao obj);
	DepartamentDao findById(Integer id);
	List<DepartamentDao> findall();

}
