package abstractfactory.car.factory;

import abstractfactory.car.service.CarEJBService;
import abstractfactory.car.service.CarRestService;
import abstractfactory.car.service.Service;

public class CarAbstractFactory implements ServicesAbstractFactory {
    @Override
    public Service getEJBService() {
        return new CarEJBService();
    }

    @Override
    public Service getRestService() {
        return new CarRestService();
    }
}
