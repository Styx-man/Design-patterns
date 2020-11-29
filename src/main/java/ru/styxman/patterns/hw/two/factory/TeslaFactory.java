package ru.styxman.patterns.hw.two.factory;

/**
 * TeslaFactory.
 *
 * @author Denis_Lukashov
 */
class TeslaFactory implements CarFactory {

    @Override
    public Car createCar(CarBody carBody, CarEngine carEngine, CarInterior carInterior) {
        Tesla tesla = new Tesla();
        tesla.setModel();
        tesla.setCarBody(carBody);
        tesla.setCarEngine(carEngine);
        tesla.setCarInterior(carInterior);
        return tesla;
    }
}
