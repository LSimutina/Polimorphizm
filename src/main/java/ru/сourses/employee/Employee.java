package ru.сourses.employee;

public class Employee {
    String nameEmp;
    Department dep;

    public Employee(String name) {
        this.nameEmp = name;
    }

    public Employee(String name, Department dep) {
        this.nameEmp = name;
        this.dep = dep;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        if (this == dep.getBoss()) return nameEmp + " начальник отдела " + dep.getName();
        return nameEmp + " работает в отделе " + dep;
    }
}