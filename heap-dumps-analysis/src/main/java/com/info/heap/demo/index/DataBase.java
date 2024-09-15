package com.info.heap.demo.index;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private String db_Name;
    private String user;
    private String password;
    private List<Permission> permissions;
    private List<Table> tables = new ArrayList<>();

    public DataBase(String db_Name) {
        this.db_Name = db_Name.toLowerCase();
    }

    public DataBase connect(String user, String password){

        return this;
    }

    public String getDb_Name() {
        return db_Name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public Table createNewTable(String tableName){
        Table table = new Table(tableName);
        tables.add(table);
        System.out.println("Create new Table: "+tableName);
        return table;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "db_Name='" + db_Name + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", permissions=" + permissions +
                ", tables=" + tables +
                '}';
    }
}
