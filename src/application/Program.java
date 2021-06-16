package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Teste insert department ====");
		Department newDepartment = new Department(null, "Sex");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
		
		System.out.println("==== Teste findById department ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("==== Teste Update department ====");
		dep = departmentDao.findById(4);
		dep.setName("Kindle");
		departmentDao.update(dep);
		System.out.println("Update Completed!");
		
		System.out.println("==== Teste Delete department ====");
		departmentDao.deleteById(8);
		System.out.println("Delete Completed!");
		
		System.out.println("==== Teste findAll department ====");
		List<Department> list = departmentDao.findAll();
		for (Department department: list) 
			System.out.println(department);
		
/*		
		System.out.println("==== Test Find Seller By ID ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== Test seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list)
			System.out.println(obj);
		
		System.out.println("\n==== Test seller findAll ====");
		list = sellerDao.findAll();
		for(Seller obj: list)
			System.out.println(obj);
		
		System.out.println("\n==== Test seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4600, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		System.out.println("\n==== Test seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
		System.out.println("\n==== Test seller delete ====");
		System.out.printf("Enter Id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
*/		
		sc.close();
	}

}
