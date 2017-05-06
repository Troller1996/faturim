/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class Tabelat {
    
    public Tabelat()  {
        try {
            Connection conn=DbConnect.Connect();
            String sqlCreate =" CREATE TABLE IF NOT EXISTS `administratori` ("+
                    "`ID` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,"+
                    "`EMRI` varchar(22) DEFAULT NULL,"+
                    "`MBIEMRI` varchar(22) DEFAULT NULL,"+
                    "`USERNAME` varchar(22) DEFAULT NULL,"+
                    "`PASSWORD` varchar(22) DEFAULT NULL"+
                    ")        ENGINE=InnoDB DEFAULT CHARSET=latin1;";
            Statement stmt = conn.createStatement();  
            stmt.execute(sqlCreate);
            sqlCreate="CREATE TABLE IF NOT EXISTS `fature_b` (" +
"  `NR_FATURE` varchar(22) NOT NULL PRIMARY KEY," +
"  `DATA` date NOT NULL,"+
"  `LEKE` int(11) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
            stmt.execute(sqlCreate);
            
            
              sqlCreate="CREATE TABLE IF NOT EXISTS `fature_sh` (" +
"  `NR_FATURE` varchar(22) NOT NULL PRIMARY KEY," +
"  `DATA` date NOT NULL," +
"  `LEKE` int(11) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1; ";
            
            stmt.execute(sqlCreate);
            sqlCreate="CREATE TABLE IF NOT EXISTS `furnitori` (" +
"  `ID_FURNITOR` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY," +
"  `EMRI` varchar(22) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1; ";
                        stmt.execute(sqlCreate);
                        
                        sqlCreate="CREATE TABLE IF NOT EXISTS  `produkti` (" +
"  `BARKODI` varchar(22) NOT NULL PRIMARY KEY," +
"  `EMRI` varchar(22) NOT NULL," +
"  `SASIA` float NOT NULL," +
"  `CMIMI_B` int(22) NOT NULL," +
"  `CMIMI_SH` int(22) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
            stmt.execute(sqlCreate);
            
sqlCreate="CREATE TABLE IF NOT EXISTS `fur_prod` (" +
"  `ID_FURNITOR` int(11) NOT NULL," +
"  `BARKODI` varchar(22) NOT NULL,"
        + "CONSTRAINT `fur_prod_ibfk_1` FOREIGN KEY (`BARKODI`)"
        + "REFERENCES `produkti` (`BARKODI`),"
        + "CONSTRAINT `fur_prod_ibfk_2` FOREIGN KEY (`ID_FURNITOR`)"
        + "REFERENCES `furnitori` (`ID_FURNITOR`)" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;";

            stmt.execute(sqlCreate);
            sqlCreate="CREATE TABLE IF NOT EXISTS  `klienti`( " +
"  `ID_KLIENT` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY," +
"  `EMRI` varchar(22) NOT NULL," +
"  `MBIEMRI` varchar(22) NOT NULL," +
"  `PIKET` int(11) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
            
            stmt.execute(sqlCreate);
            
                 sqlCreate="CREATE TABLE IF NOT EXISTS  `operatori` (" +
"  `ID_OPERATOR` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY," +
"  `EMRI` varchar(22) NOT NULL," +
"  `MBIEMRI` varchar(22) NOT NULL," +
"  `USERNAME` varchar(22) NOT NULL," +
"  `PASSWORD` varchar(22) NOT NULL," +
"  `ID_ADMINISTRATOR` int(11) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
                 
                        stmt.execute(sqlCreate);
 
                        
             sqlCreate="CREATE TABLE IF NOT EXISTS  `shitesi` (" +
"  `ID_SHITES` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY," +
"  `EMRI` varchar(22) NOT NULL," +
"  `MBIEMRI` varchar(22) NOT NULL," +
"  `USERNAME` varchar(22) NOT NULL," +
"  `PASSWORD` varchar(22) NOT NULL," +
"  `ID_ADMINISTRATOR` int(11) NOT NULL" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;";
            
                     stmt.execute(sqlCreate);
            
            sqlCreate="CREATE TABLE IF NOT EXISTS `shit_prod` (" +
"  `BARKODI` varchar(22) NOT NULL," +
"  `ID_SHITES` int(11) NOT NULL,"
                    + "CONSTRAINT `shit_prod_ibfk_1` FOREIGN KEY (`ID_SHITES`)"
                    + "REFERENCES `shitesi` (`ID_SHITES`),"
                    + "CONSTRAINT `shit_prod_ibfk_2` FOREIGN KEY (`BARKODI`)"
                    + "REFERENCES `produkti` (`BARKODI`)"+
") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
            
            stmt.execute(sqlCreate);
            
             sqlCreate="ALTER TABLE `shit_prod`" +
"  ADD UNIQUE KEY `BARKODI` (`BARKODI`)," +
"  ADD UNIQUE KEY `ID_SHITES` (`ID_SHITES`);";
            stmt.execute(sqlCreate);
            
            
            
            
            sqlCreate="ALTER TABLE `fur_prod`" +
"  ADD UNIQUE KEY `ID_FURNITOR` (`ID_FURNITOR`)," +
"  ADD UNIQUE KEY `BARKODI` (`BARKODI`);";
            
                        stmt.execute(sqlCreate);
                        
                        
sqlCreate="ALTER TABLE `operatori`" +
"  ADD KEY `ID_ADMINISTRATOR` (`ID_ADMINISTRATOR`),"
        + "ADD CONSTRAINT `operatori_ibfk_1` FOREIGN KEY (`ID_ADMINISTRATOR`) REFERENCES `administratori` (`ID`),"
        + "ADD UNIQUE KEY `USERNAME`;";
              stmt.execute(sqlCreate);
              
              
            sqlCreate="ALTER TABLE `shitesi`" +
"  ADD KEY `ID_ADMINISTRATOR` (`ID_ADMINISTRATOR`),"
                    + "ADD CONSTRAINT `shitesi_ibfk_1` FOREIGN KEY (`ID_ADMINISTRATOR`) REFERENCES `administratori` (`ID`),"
                    + "ADD UNIQUE KEY `USERNAME`;";
              stmt.execute(sqlCreate);
 
        } catch (SQLException ex) {if(ex.toString().equals("java.sql.SQLException: No database selected"))System.out.println(ex);
        }
}

}
