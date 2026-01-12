package bridge.converter;

import bridge.converter.converters.CSVConverter;
import bridge.converter.converters.JsonConverter;
import bridge.converter.employees.Developer;
import bridge.converter.employees.ProjectManager;

public class Client {
    public static void main(String[] args) {
        final var csvConverter = new CSVConverter();
        final var jsonConverter = new JsonConverter();

        final var developer = new Developer("Vinicius", 25, 2_500.0);
        final var projectManager = new ProjectManager("Matheus", 45, 10_000.0);

        System.out.println(csvConverter.getEmployeeFormated(developer));
        System.out.println(jsonConverter.getEmployeeFormated(developer));
        System.out.println(csvConverter.getEmployeeFormated(projectManager));
        System.out.println(jsonConverter.getEmployeeFormated(projectManager));
    }
}
