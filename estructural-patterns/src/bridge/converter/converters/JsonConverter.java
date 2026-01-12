package bridge.converter.converters;

import bridge.converter.employees.Employee;

public class JsonConverter implements Converter {
    @Override
    public String getEmployeeFormated(Employee employee) {
        return String.format(
                "{\"name\":\"%s\",\"age\":%d,\"salary\":%.2f}",
                employee.getName(),
                employee.getAge(),
                employee.getSalary()
        );
    }
}
