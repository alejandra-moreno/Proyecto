package controler;

import java.util.ArrayList;

import dao.CustomerDAO;
import domain.Customer;

public class CustomerControler {

    public void getCustomer(ArrayList<Customer> lista) {
        CustomerDAO.getClientes(lista);
    }
}