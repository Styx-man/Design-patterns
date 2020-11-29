package ru.styxman.patterns.hw.two.factory;

/**
 * Car.
 *
 * @author Denis_Lukashov
 */
public abstract class Car {

    String model;
    CarBody body;
    CarEngine engine;
    CarInterior interior;

    abstract void setModel();

    abstract void setCarBody(CarBody carBody);

    abstract void setCarEngine(CarEngine carEngine);

    abstract void setCarInterior(CarInterior carInterior);

    public String getModel() {
        return model;
    }

    public CarBody getBody() {
        return body;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public CarInterior getInterior() {
        return interior;
    }
}
