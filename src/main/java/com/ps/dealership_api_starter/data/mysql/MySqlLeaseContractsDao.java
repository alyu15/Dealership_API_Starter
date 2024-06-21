package com.ps.dealership_api_starter.data.mysql;

import com.ps.dealership_api_starter.data.LeaseContractsDao;
import com.ps.dealership_api_starter.models.LeaseContract;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlLeaseContractsDao extends MySqlDaoBase implements LeaseContractsDao {

    public MySqlLeaseContractsDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public LeaseContract getByLeaseContractId(int contract_id) {
        return null;
    }

    @Override
    public LeaseContract addLeaseContract(LeaseContract leaseContract) {
        return null;
    }

    protected static LeaseContract mapResultSet(ResultSet resultSet) throws SQLException {

        int contractId = resultSet.getInt("contract_id");
        String date = resultSet.getString("contract_date");
        String customerName = resultSet.getString("customer_name");
        String customerEmail = resultSet.getString("customer_email");
        int vin = resultSet.getInt("vin");
        double salesTax = resultSet.getDouble("sales_tax");
        double recordingFee = resultSet.getDouble("recording_fee");
        double processingFee = resultSet.getDouble("processing_fee");
        double totalPrice = resultSet.getDouble("total_price");
        double monthlyPayment = resultSet.getDouble("monthly_payment");

        return new LeaseContract(contractId, date, customerName, customerEmail, vin , salesTax,
                recordingFee, processingFee, totalPrice, monthlyPayment);
    }
}
