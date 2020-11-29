package ru.styxman.patterns.hw.two.factory;

/**
 * LandRoverFactory.
 *
 * @author Denis_Lukashov
 */
class LandRoverFactory implements CarFactory {

    @Override
    public Car createCar(CarBody carBody, CarEngine carEngine, CarInterior carInterior) {
        LandRover landRover = new LandRover();
        landRover.setModel();
        landRover.setCarBody(carBody);
        landRover.setCarEngine(carEngine);
        landRover.setCarInterior(carInterior);
        return landRover;
    }
}
