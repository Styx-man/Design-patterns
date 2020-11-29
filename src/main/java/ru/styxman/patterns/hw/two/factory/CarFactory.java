package ru.styxman.patterns.hw.two.factory;

/**
 * CarFactory.
 *
 * @author Denis_Lukashov
 */
public interface CarFactory {
    Car createCar(CarBody carBody, CarEngine carEngine, CarInterior carInterior);
}
