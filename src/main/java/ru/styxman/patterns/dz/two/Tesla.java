package ru.styxman.patterns.dz.two;

/**
 * Tesla.
 *
 * @author Denis_Lukashov
 */
public class Tesla extends Car {

    @Override
    void setModel() {
        this.model = "Tesla";
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
