package com.capgemini.xyz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;
import com.capgemini.xyz.exception.LoanException;
import com.capgemini.xyz.utility.DBConnection;

public class LoanDao implements ILoanDao{
	static Logger logger=Logger.getLogger(LoanDao.class);
	@Override
	public long applyLoan(Loan loan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long insertCust(Customer cust) throws Exception {
		
		logger.info("in Add Sports");
		int queryResult=0;
		Connection connection=DBConnection.getConnection();
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		long custId=0;
		
		try {
			preparedStatement=connection.prepareStatement(IQueryMapper.INSERT_Customer);
			
			preparedStatement.setString(1,cust.getCustName());
			preparedStatement.setString(2, cust.getAddress());
			preparedStatement.setString(3,cust.getEmail());
			queryResult=preparedStatement.executeUpdate();
			Statement st=connection.createStatement();
			resultSet=st.executeQuery(null);
			
			if(resultSet.next()){
				custId=resultSet.getLong(1);
				
			}
			
			if(queryResult==0){
				logger.error("not added");
				throw new LoanException();
			}
			else{
				logger.info("added succesfully");
				
			}
			
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
        
		return custId;
		
		
	}

}
