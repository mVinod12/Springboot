package com.ashokit.services;


public interface CustomerService {
	
public void fetchCustomerByName(String name);
	
	public void fetchCustomersByNameAndLocation(String name, String location);
	
	public void fetchCustomersByLocationAndPagination( String location, int pageSize,int currentPage);
	
	public void getCountofCustomerName(String name);
	
	public void fetchCustomersBetweenBillAmount(float stBillAmount, float endBillAmount);
	

}
