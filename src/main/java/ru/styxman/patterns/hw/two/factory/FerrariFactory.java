package ru.styxman.patterns.hw.two.factory;

/**
 * FerrariFactory.
 *
 * @author Denis_Lukashov
 */
class FerrariFactory implements CarFactory {

    @Override
    public Car createCar(CarBody carBody, CarEngine carEngine, CarInterior carInterior) {
        Ferrari ferrari = new Ferrari();
        ferrari.setModel();
        ferrari.setCarBody(carBody);
        ferrari.setCarEngine(carEngine);
        ferrari.setCarInterior(carInterior);
        return ferrari;
    }
}
