package com.info.heap.demo.index;

public class Column<T> {
    private boolean isPrimary;
    private String column_name;
    private boolean is_nullable;
    private boolean is_unique;
    private T data;
    private Class dataType ;

    public Column(String column_name) {
        this.column_name = column_name;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public boolean isIs_nullable() {
        return is_nullable;
    }

    public void setIs_nullable(boolean is_nullable) {
        this.is_nullable = is_nullable;
    }

    public boolean isIs_unique() {
        return is_unique;
    }

    public void setIs_unique(boolean is_unique) {
        this.is_unique = is_unique;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {

        this.data = data;
        dataType = getData().getClass();
        System.out.println(dataType);
    }

    public Class<T> getDataType() {
        return dataType;
    }

    public void setDataType(Class<T> dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "Column{" +
                "isPrimary=" + isPrimary +
                ", column_name='" + column_name + '\'' +
                ", is_nullable=" + is_nullable +
                ", is_unique=" + is_unique +
                ", data=" + data +
                ", dataType=" + dataType +
                '}';
    }
}
