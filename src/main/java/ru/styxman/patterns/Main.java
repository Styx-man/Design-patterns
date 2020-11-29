package ru.styxman.patterns;

import ru.styxman.patterns.hw.two.CarShop;
import ru.styxman.patterns.hw.two.factory.*;

/**
 * Main.
 *
 * @author Denis_Lukashov
 */
public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = CarFactoryHelper.create("Land Rover");
        CarBody carBody = new CarBody();
        carBody.setName("Defender");
        carBody.setColour("Black");
        carBody.setType("Hatchback");
        CarEngine carEngine = new CarEngine();
        carEngine.setType("Diesel");
        carEngine.setPower("Very Powerful :)");
        CarInterior carInterior = new CarInterior();
        carInterior.setName("Luxury");
        carInterior.setColour("White");
        carInterior.setMaterial("Leather");

        CarShop carShop = new CarShop(carFactory, carBody, carEngine, carInterior);

        carShop.getCarInfo();
    }
}
