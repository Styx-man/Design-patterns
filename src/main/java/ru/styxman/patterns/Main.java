package ru.styxman.patterns;

import ru.styxman.patterns.dz.two.CarBody;
import ru.styxman.patterns.dz.two.CarEngine;
import ru.styxman.patterns.dz.two.CarFactory;
import ru.styxman.patterns.dz.two.CarFactoryHelper;
import ru.styxman.patterns.dz.two.CarInterior;
import ru.styxman.patterns.dz.two.CarShop;

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
