package ru.styxman.patterns.dz.two;

/**
 * CarFactory.
 *
 * @author Denis_Lukashov
 */
public interface CarFactory {
    Car createCar(CarBody carBody, CarEngine carEngine, CarInterior carInterior);
}
