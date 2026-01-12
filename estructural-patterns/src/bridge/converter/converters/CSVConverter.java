package bridge.converter.converters;

import bridge.converter.employees.Employee;

import java.util.Locale;

public class CSVConverter implements Converter {
    @Override
    public String getEmployeeFormated(Employee employee) {
        return String.format(
                Locale.US,
                "%s,%d,%.2f",
                employee.getName(),
                employee.getAge(),
                employee.getSalary()
        );
    }
}
