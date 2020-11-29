package ru.styxman.patterns.hw.two;

import ru.styxman.patterns.hw.two.factory.*;

/**
 * CarShop.
 *
 * @author Denis_Lukashov
 */
public class CarShop {
    private Car car;

    public CarShop(CarFactory factory, CarBody carBody, CarEngine carEngine, CarInterior carInterior) {
        car = factory.createCar(carBody, carEngine, carInterior);
    }

    public void getCarInfo() {
        System.out.println("Your car is " + car.getModel() + ".\n"
                + "It has body with name: " + car.getBody().getName() + ", colour: " + car.getBody().getColour()
                + ", and type" + car.getBody().getType() + ".\n"
                + "It has engine type: " + car.getEngine().getType() + ", with power: " + car.getEngine().getPower() + ".\n"
                + "it has interior with name: " + car.getInterior().getName() + ", with colour: "
                + car.getInterior().getColour() + ", and with material: " + car.getInterior().getMaterial() + ".\n");
    }
}
