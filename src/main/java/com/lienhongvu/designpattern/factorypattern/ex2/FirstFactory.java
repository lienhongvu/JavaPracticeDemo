package com.lienhongvu.designpattern.factorypattern.ex2;

/**
 * Created by hvlien on 10/10/2017.
 */
public class FirstFactory extends ConnectionFactory {

    public Connection createConnection(String type){
        switch (type.toUpperCase()){
            case "ORACLE":
                return new OracleConnection();
            case "MYSQL":
                return new MySqlConnection();
            case "SQL":
                return new SqlServerConnection();
            default:
                return null;
        }
    }
}
