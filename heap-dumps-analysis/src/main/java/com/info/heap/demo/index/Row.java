package com.info.heap.demo.index;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private Object row_id;
    private List<Column> columns = new ArrayList<>();

    public List<Column> getColumns() {
        return columns;
    }

    public int getRowID(){
        return  (Integer)row_id;
    }

    public void setColumns(List<Column> columns) {
                this.columns = columns;
    }

    public <T> Column<T> addNewColumn(Column column){
        if (columns.isEmpty()){
            this.row_id = column.getData();
        }
        columns.add(column);
        return column;
    }

    @Override
    public String toString() {
        return "Row{" +
                "row_id=" + row_id +
                ", columns=" + columns +
                '}';
    }
}
