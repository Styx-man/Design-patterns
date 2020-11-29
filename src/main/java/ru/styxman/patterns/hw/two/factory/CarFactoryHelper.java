package ru.styxman.patterns.hw.two.factory;

/**
 * CarFactoryHelper.
 *
 * @author Denis_Lukashov
 */
public class CarFactoryHelper {

    public static CarFactory create(String carName) {
        switch (carName) {
            case "Land Rover":
                return new LandRoverFactory();
            case "Tesla":
                return new TeslaFactory();
            case "Ferrari":
                return new FerrariFactory();
            default:
                throw new RuntimeException("Ошибка при выборе марки машины");
        }
    }
}
