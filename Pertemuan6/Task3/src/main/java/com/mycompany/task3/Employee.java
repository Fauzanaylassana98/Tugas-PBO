package com.mycompany.task3;

class Employee implements Sortable{
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
    
    public Employee(String n, double s, int day, int month, int year){
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }
    
    public void print(){
        System.out.println(name + " " + salary + " " + hireYear());
    }
    
    public void raiseSalary(double byPercent){
        salary *= 1 + byPercent / 100;
    }
    
    public int hireYear(){
        return hireyear;
    }
    
    // Getter untuk salary
    public double getSalary() {
        return salary;
    }

    // Setter untuk salary
    public void setSalary(double newSalary) {
        salary = newSalary;
    }
    
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.getSalary()) return -1;
        if (salary > eb.getSalary()) return 1;
        return 0;
    }
    
    @Override
    public void shell_sort(Sortable[] a) {
        int n = a.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j = i;

                while (j >= gap && a[j - gap].compare(temp) > 0) {
                    a[j] = a[j - gap];
                    j -= gap;
                }

                a[j] = temp;
            }

            gap /= 2;
        }
    }
}

interface Sortable{ 
    public abstract int compare(Sortable b);
    public abstract void shell_sort(Sortable[] a);
}