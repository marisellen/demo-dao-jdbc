package application;

import Model.DAO.DaoFactory;
import Model.DAO.Impl.SellerDaoJDBC;
import Model.DAO.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"Books");
        Seller seller = new Seller(1,"Maria","maria@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj);
        System.out.println(seller);
    }
}
