package service;

import model.Customer;
import model.Province;

public interface IProvinceService extends IGeneralService<Province> {
    void save(Customer customer);
}