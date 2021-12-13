package task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(employee());
        System.out.println(employee());
        System.out.println(employee());
    }

    public static Employee employee() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите имя сотрудника латиницей: ");
            String name = reader.readLine();
            System.out.println("Введите фамилию сотрудника латиницей: ");
            String surname = reader.readLine();
            System.out.println("Введите зарплату сотрудника: ");
            String salaryString = reader.readLine();

            try {
                double salary = Double.parseDouble(salaryString);
                return new Employee(name, surname, salary);
            } catch (NameException exception) {
                System.err.println("Вы ввели фио не латиницей: " + exception.input + "\n" + "Попробуйте ещё раз");
            } catch (SalaryException exception) {
                System.err.println("Число отрицательное: " + exception.salary + "\n" + "Попробуйте ещё раз");
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                System.out.println("Попробуйте ещё раз");
            }
        }
    }
}
