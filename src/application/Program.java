package application;

import Model.DAO.Impl.DaoFactory;
import Model.DAO.Impl.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("--- Teste 1 ---");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("--- Teste 2 ---");
        Department department = new Department(2,null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        System.out.println(sellers);

        System.out.println("--- Teste 3 ---");
        sellers = sellerDao.findAll();
        for (Seller sellerList : sellers) {
            System.out.println(sellers);
        }

        System.out.println("--- Teste 4 ---");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("--- Teste 5 ---");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Updated!");

        System.out.println("--- Teste 6 ---");
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted!");
        sc.close();
    }
}
