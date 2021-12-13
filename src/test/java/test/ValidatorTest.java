package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task17.NameException;
import task17.SalaryException;
import task17.Validator;

public class ValidatorTest {
    @Test
    public void checkSalaryNoException() {
        Assertions.assertDoesNotThrow(() -> Validator.checkSalary(1));
    }

    @Test
    public void checkSalaryNegativeSalary() {
        Assertions.assertThrows(SalaryException.class, () -> Validator.checkSalary(-1));
    }

    @Test
    public void checkFioNoException() {
        Assertions.assertDoesNotThrow(() -> Validator.checkFio("abc"));
    }

    @Test
    public void checkFioException() {
        Assertions.assertThrows(NameException.class, () -> Validator.checkFio("абв"));
    }

    @Test
    public void checkNulException() {
        Assertions.assertThrows(NullPointerException.class, () -> Validator.checkFio(null));
        Assertions.assertThrows(NameException.class, () -> Validator.checkFio(""));
    }
}
