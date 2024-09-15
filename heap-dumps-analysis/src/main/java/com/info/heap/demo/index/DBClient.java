package com.info.heap.demo.index;

import java.util.List;

public class DBClient {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase("Test_DB");
        dataBase.connect("user", "pass");
        dataBase.setPermissions(List.of(Permission.ALL));
        Table table = dataBase.createNewTable("Employee");
        table.setTable_header(List.of("id","name", "age"));

        Row row1 = new Row();


        Column<Integer> id_col = new Column<>("id");
        id_col.setIs_nullable(false);
        id_col.setIs_unique(true);
        id_col.setPrimary(true);
        id_col.setData(1);
        row1.addNewColumn(id_col);

        Column<String> name = new Column<>("name");
        name.setIs_nullable(false);
        name.setIs_unique(false);
        name.setPrimary(false);
        name.setData("Atish");
        row1.addNewColumn(name);

        Column<Integer> age = new Column<>("age");
        age.setIs_nullable(false);
        age.setIs_unique(false);
        age.setPrimary(false);
        age.setData(53);
        row1.addNewColumn(age);
        table.addNewRow(row1);
        Row row2 = new Row();
        Column<Integer> id_col1 = new Column<>("id");
        id_col1.setIs_nullable(false);
        id_col1.setIs_unique(true);
        id_col1.setPrimary(true);
        id_col1.setData(2);
        row2.addNewColumn(id_col1);

        Column<String> name1 = new Column<>("name");
        name1.setIs_nullable(false);
        name1.setIs_unique(false);
        name1.setPrimary(false);
        name1.setData("Atish");
        row2.addNewColumn(name1);
        Column<Integer> age1 = new Column<>("age");
        age1.setIs_nullable(false);
        age1.setIs_unique(false);
        age1.setPrimary(false);
        age1.setData(53);
        row2.addNewColumn(age1);
        table.addNewRow(row2);

        System.out.println(dataBase);



    }
}
