package ru.styxman.patterns.dz.two;

/**
 * LandRover.
 *
 * @author Denis_Lukashov
 */
public class LandRover extends Car {

    @Override
    void setModel() {
        this.model = "Land Rover";
    }

    @Override
    public void setCarBody(CarBody carBody) {
        this.body = carBody;
    }

    @Override
    public void setCarEngine(CarEngine carEngine) {
        this.engine = carEngine;
    }

    @Override
    public void setCarInterior(CarInterior carInterior) {
        this.interior = carInterior;

    }
}
