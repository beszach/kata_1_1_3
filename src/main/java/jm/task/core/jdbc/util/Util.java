package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {

    private String HOSTNAME;
    private String PORT;
    private String LOGIN;
    private String PASSWORD;
    private String TABLENAME;
    private String DATABASENAME;

    public Util() {

    }

    public Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://"+HOSTNAME+":"+PORT+"/"+DATABASENAME+"?useSSL=false";
        return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

    public String getHOSTNAME() {
        return HOSTNAME;
    }

    public void setHOSTNAME(String HOSTNAME) {
        this.HOSTNAME = HOSTNAME;
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getTABLENAME() {
        return TABLENAME;
    }

    public void setTABLENAME(String TABLENAME) {
        this.TABLENAME = TABLENAME;
    }

    public String getDATABASENAME() {
        return DATABASENAME;
    }

    public void setDATABASENAME(String DATABASENAME) {
        this.DATABASENAME = DATABASENAME;
    }
}
