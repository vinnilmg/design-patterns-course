package bridge.converter.converters;

import bridge.converter.employees.Employee;

public class CSVConverter implements Converter {
    @Override
    public String getEmployeeFormated(Employee employee) {
        return String.format(
                "%s,%d,%.2f",
                employee.getName(),
                employee.getAge(),
                employee.getSalary()
        );
    }
}
