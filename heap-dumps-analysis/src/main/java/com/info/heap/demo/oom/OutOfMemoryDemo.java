package com.info.heap.demo.oom;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    public static void main(String ad[]){
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeList1 = new ArrayList<>();
        List<Employee> employeeList2 = new ArrayList<>();
        List<Employee> employeeList3 = new ArrayList<>();
        List<Employee> employeeList4 = new ArrayList<>();
        for(int i=0;i<Integer.MAX_VALUE;i++){

            employeeList.add(addNewEmployee(i));
            employeeList1.add(addNewEmployee(i));
            employeeList2.add(addNewEmployee(i));
            employeeList3.add(addNewEmployee(i));
            employeeList4.add(addNewEmployee(i));
            System.out.println("List size :"+employeeList.size());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static Employee addNewEmployee(int i) {
        if(i%2==0){
            return new Manager("Manager-0"+i, "CB-01", "Dev", 35, 1001+i);
        }else{
            return new HRManager("HR-Manager-0"+i, "CB-03", "Dev", 35, 1001+i);
        }

    }

    static class Manager extends Employee{

        public Manager(String name, String cabin, String department, int age, int id) {
            super(name, cabin, department, age, id);
        }
    }

    static class HRManager extends Employee{

        public HRManager(String name, String cabin, String department, int age, int id) {
            super(name, cabin, department, age, id);
        }
    }

    private static class Employee {
        String name;
        String cabin;
        String department;
        int age;
        int id;

        public Employee(String name, String cabin, String department, int age, int id) {
            this.name = name;
            this.cabin = cabin;
            this.department = department;
            this.age = age;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCabin() {
            return cabin;
        }

        public void setCabin(String cabin) {
            this.cabin = cabin;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
