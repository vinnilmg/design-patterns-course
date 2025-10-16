package abstractfactory.car.service;

public class CarEJBService implements Service {
    @Override
    public void save(String model) {
        System.out.println("Saving with EJB");
    }

    @Override
    public void delete(String model) {
        System.out.println("Deleting with EJB");
    }
}
