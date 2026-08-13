package application;

import Model.DAO.DaoFactory;
import Model.DAO.DepartmentDao;
import Model.DAO.Impl.DepartmentDaoJDBC;
import entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao department = DaoFactory.createDepartmentDao();

        System.out.println("--- Teste 1 ---");
        Department dep = department.findById(1);
        System.out.println(dep);

        System.out.println("--- Teste 2 ---");
        List<Department> deps = department.findAll();
        for (Department dep1 : deps) {
            System.out.println(dep1);
        }

        System.out.println("--- Teste 3 ---");
        Department newDep = new Department(null, "Music");
        department.insert(newDep);
        System.out.println("Inserted" +  newDep.getId());

        System.out.println("--- Teste 4 ---");
        Department dep2 = department.findById(2);
        dep2.setName("Food");
        department.update(dep2);
        System.out.println("Updated" +  dep2.getName());

        System.out.println("--- Teste 5 ---");
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        department.deleteById(id);
        System.out.println("Deleted" +  id);

        sc.close();
    }
}
