package seminars.second.hw;

import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Car("Volkswagen", "Golf", 2014);
        Vehicle moto = new Motorcycle("Suzuki", "GSX-S1000", 2015);

        assertInstanceOf(Vehicle.class, car);

        assertEquals(4, ((Car) car).getNumWheels());

        assertEquals(2, ((Motorcycle) moto).getNumWheels());

        car.testDrive();
        assertEquals(60, ((Car) car).getSpeed());

        moto.testDrive();
        assertEquals(75, ((Motorcycle) moto).getSpeed());

        car.testDrive();
        car.park();
        assertEquals(0, ((Car) car).getSpeed());

        moto.testDrive();
        moto.park();
        assertEquals(0, ((Motorcycle) moto).getSpeed());
    }
}