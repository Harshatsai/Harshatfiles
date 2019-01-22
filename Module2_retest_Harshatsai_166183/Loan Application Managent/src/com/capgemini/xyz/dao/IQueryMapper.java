package com.capgemini.xyz.dao;

public interface IQueryMapper {
	
	String INSERT_Customer="insert into Customer values(Cust_Seq.nextval,?,?,?)";
	public static final String CUSTOMERID_QUERY_SEQUENCE="select Cust_seq.currval from Customer";
	String MAXCUST_ID="select max(Cust_id) from Customer";
	String SEARCH_SPORTS="select * from Sports_details where sports_id=?";


}
