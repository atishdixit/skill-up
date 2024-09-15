package com.info.heap.demo.index;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String table_name;
    private List<String> table_header;
    private List<Row> rows;
    private int rowSize = 0;

    public Table(String table_name) {
        this.table_name = table_name.toLowerCase();
    }

    public void setTable_header(List<String> table_header){
       this.table_header = table_header;
        rowSize = table_header.size();
        rows = new ArrayList<>(rowSize-1);
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public String getTable_name() {
        return table_name;
    }

public void addNewRow(Row row){
        if(rows.size()<rowSize){
            this.rows.add(row);
        }else {
            throw new UnsupportedOperationException("Unsupported Operation Exception");
        }
}

    public List<Row> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table_name='" + table_name + '\'' +
                ", table_header=" + table_header +
                ", rows=" + rows +
                ", size=" + rowSize +
                '}';
    }
}
