package bridge.converter.converters;

import bridge.converter.employees.Employee;

public class TextConverter implements Converter {
    @Override
    public String getEmployeeFormated(Employee employee) {
        return String.format(
                "O %s tem %d anos e ganha R$ %.2f",
                employee.getName(),
                employee.getAge(),
                employee.getSalary()
        );
    }
}
