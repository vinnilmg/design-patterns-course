package abstractfactory.car.service;

public class CarRestService implements Service {
    @Override
    public void save(String model) {
        System.out.println("Saving with REST");
    }

    @Override
    public void delete(String model) {
        System.out.println("Deleting with REST");
    }
}
