package application;

import Model.DAO.Impl.DaoFactory;
import Model.DAO.Impl.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
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
    }
}
