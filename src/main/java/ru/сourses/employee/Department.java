package ru.сourses.employee;

public class Department {
    private String name;
    private Employee boss;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Employee boss) {
        this.name = name;
        if( (boss != null) && (boss.getDep() != this) ){
            validBossDep(boss);
        }
        this.boss = boss;
    }

    public Employee getBoss() {
        return boss;
    }

    public String getName() {
        return name;
    }

    public void setBoss(Employee boss) {
        validBossDep(boss);
        this.boss = boss;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", начальник которого " + boss.nameEmp;
    }

    public void validBossDep(Employee boss){
        if(boss.getDep() != this){
            boss.setDep(this);
        }

    }
}