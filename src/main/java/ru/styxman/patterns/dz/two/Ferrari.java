package ru.styxman.patterns.dz.two;

/**
 * Ferrari.
 *
 * @author Denis_Lukashov
 */
public class Ferrari extends Car {

    @Override
    void setModel() {
        this.model = "Ferrari";
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
