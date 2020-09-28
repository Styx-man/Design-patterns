package ru.styxman.patterns.dz.two;

/**
 * FerrariFactory.
 *
 * @author Denis_Lukashov
 */
public class FerrariFactory implements CarFactory {

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
