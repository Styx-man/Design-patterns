package ru.styxman.patterns.hw.two.factory;

/**
 * LandRover.
 *
 * @author Denis_Lukashov
 */
class LandRover extends Car {

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
