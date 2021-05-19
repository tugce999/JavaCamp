package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService 
{
  public void Save(Customer customer) throws  Exception;
}
