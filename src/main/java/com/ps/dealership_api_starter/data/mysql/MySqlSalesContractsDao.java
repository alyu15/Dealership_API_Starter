package com.ps.dealership_api_starter.data.mysql;

import com.ps.dealership_api_starter.data.SalesContractsDao;
import com.ps.dealership_api_starter.models.SalesContract;

import javax.sql.DataSource;

public class MySqlSalesContractsDao extends MySqlDaoBase implements SalesContractsDao {

    public MySqlSalesContractsDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public SalesContract getBySalesContractId(int contract_id) {
        return null;
    }

    @Override
    public SalesContract createSalesContract(SalesContract salesContract) {
        return null;
    }
}
