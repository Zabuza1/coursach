package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ivan", "Vanovich", "Ivanov", 100_000, 1);
        employees[1] = new Employee("Petr", "Petrov", "Petrovich", 100_500, 2);
        employees[2] = new Employee("Valeryi", "Valerov", "Valerevich", 110_500, 3);
        employees[3] = new Employee("Sergey", "Krasnov", "Sergeevich", 124_234, 4);
        employees[4] = new Employee("Alexander", "Alexandrov", "Alexandrovich", 124_233, 5);
        employees[5] = new Employee("Vasiliy", "Ytkin", "Ivanovich", 444_234, 2);
        employees[6] = new Employee("Sasha", "Simple", "Dimple", 432_234, 5);
        employees[7] = new Employee("Gosha", "Komarov", "Daniilovich", 123_777, 3);
        employees[8] = new Employee("Kyzya", "Kosyak", "Pavlovich", 333_123, 4);
        employees[9] = new Employee("Masha", "Vietova", "Pavlovna", 500_000, 6);
        System.out.println("The maximum amount spent was " + sumSalary(employees)); //Сумма зарплат
        System.out.println("Dude with the maximum salary is " + maxSalaryDude(employees)); //Максимальная ЗП
        System.out.println("Dude with the minimal salary is " +  minSalaryDude(employees)); //Минимальная ЗП
        System.out.println("Average salary is " + averageSalary(employees)); //Средняя ЗП
        System.out.println(fml(employees));
    }

    public static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
            System.out.println(employees[i]);
        }
        return sum;
    }

    public static Employee maxSalaryDude(Employee[] employees) {
        Employee eMax = employees[0];
        for (Employee j : employees)
            if (j.getSalary() > eMax.getSalary())
                eMax = j;
        return eMax;
    }

    public static Employee minSalaryDude(Employee[] employees) {
        Employee eMin = employees[0];
        for (Employee j : employees)
            if (j.getSalary() < eMin.getSalary())
                eMin = j;
        return eMin;
    }

    public static double averageSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        double average = 0;
        if (employees.length > 0) {
            double sum1 = 0;
            for (int o = 0; o < employees.length; o++) {
                sum1 += employees[o].getSalary();
            }
        }
        average = sum / employees.length;
        return average;
    }
    public static Employee fml(Employee[] employees){
        for (int h = 0; h < employees.length; h++) {
            System.out.println(employees[h].name + " " +employees[h].getMiddleName()+ " " +employees[h].getLastName());
    }
        return null;
    }
}

