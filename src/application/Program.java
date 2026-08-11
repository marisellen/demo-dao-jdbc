package application;

import Model.DAO.Impl.DaoFactory;
import Model.DAO.Impl.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("--- Teste 1 ---");
        Seller seller = sellerDao.findById(1);

        System.out.println(seller);
    }
}
