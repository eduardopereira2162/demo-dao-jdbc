package applcation;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Principal2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao  = DaoFactory.createDepartamentDao();

		
		
		System.out.println("===TEST 1: departament findByid");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n===TEST 2: departament findAll ");
		List<Department> list = new ArrayList<Department>();
		list = departmentDao.findall();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===TEST 3: departament update ");
		department = departmentDao.findById(9);
		department.setName("TESTE 2");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n===TEST 4: departament delete ");
		departmentDao.deleteById(10);
		System.out.println("Delete completed");
		
		System.out.println("\n===TEST 5: departament insert ");
		Department newDepartment = new Department(null, "TESTE5");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
	
		
		
	}
	

}
