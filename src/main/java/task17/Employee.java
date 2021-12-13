package task17;

import java.text.MessageFormat;

public class Employee {
    String name;
    String surname;
    double salary;
    int id;
    int number = (int) (0 + Math.random() * 15000);

    Employee(String name, String surname, double salary) throws NameException, SalaryException {
        Validator.checkFio(name);
        this.name = name;
        Validator.checkFio(surname);
        this.surname = surname;
        Validator.checkSalary(salary);
        this.salary = salary;
        id = ++number + (int) (0 + Math.random() * 222);
    }

    public String toString() {
        return MessageFormat.format("'{'name=''{0}'', surname=''{1}'', salary={2}, id={3}'}'",
                name, surname, salary, id);
    }
}
