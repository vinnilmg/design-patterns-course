package abstractfactory.car.factory;

import abstractfactory.car.service.Service;

public interface ServicesAbstractFactory {
    Service getEJBService();

    Service getRestService();
}
