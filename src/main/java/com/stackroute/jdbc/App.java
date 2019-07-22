package com.stackroute.jdbc;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("DatabaseMetadataDemo");
        DatabaseMetadataDemo metadataDemo=new DatabaseMetadataDemo();
        metadataDemo.databaseMetadata();
        System.out.println();

        System.out.println("JdbcBatchDemo");
        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        jdbcBatchDemo.jdbcBatch();
        System.out.println();

        System.out.println("ResultSetMetadataDemo");
        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.resultSetMetaData();
        System.out.println();

        System.out.println("RowsetDemo");
        RowSetDemo rowSetDemo=new RowSetDemo();
        System.out.println("JdbcRowSet");
        rowSetDemo.jdbcRowSet();
        System.out.println("CacheRowSet");
        rowSetDemo.cachedRowSet();
        System.out.println();

        System.out.println("SimpleJdbcDemo");
        String name="Sabya";
        String gender="M";
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        System.out.println("GetEmployeeDetails");
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println("GetEmployeeDetailsInReverse");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println("GetEmployeeDetailsFromSecondRowInReverse");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println("GetEmployeeDetailsByNameAndGender");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender(name,gender);
        System.out.println();

        System.out.println("JdbcTransactionDemo");
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.getEmployeeDetailsByNameAndGender();
    }
}
