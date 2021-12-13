package task17;

public class Validator {
    public static void checkSalary(double salary) throws SalaryException {
        if (salary <= 0) {
            throw new SalaryException(salary);
        }
    }

    public static void checkFio(String input) throws NameException {
        String regex = "[A-z]*";
        if (!input.matches(regex) || input.equals("")) {
            throw new NameException(input);
        }
    }
}
