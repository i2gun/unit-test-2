package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle car = new Car("Volkswagen", "Golf", 2014);
    Vehicle moto = new Motorcycle("Suzuki", "GSX-S1000", 2015);

    @Test
    void testClassCarExtendsVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void testCarHasFourWheels() {
        assertEquals(4, ((Car) car).getNumWheels());
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        assertEquals(2, ((Motorcycle) moto).getNumWheels());
    }

    @Test
    void testTestDriveSpeedOfCar() {
        car.testDrive();
        assertEquals(60, ((Car) car).getSpeed());
    }

    @Test
    void testTestDriveSpeedOfMotorcycle() {
        moto.testDrive();
        assertEquals(75, ((Motorcycle) moto).getSpeed());
    }

    @Test
    void testParkingSpeedOfCar() {
        car.testDrive();
        car.park();
        assertEquals(0, ((Car) car).getSpeed());
    }

    @Test
    void testParkingSpeedOfMotorcycle() {
        moto.testDrive();
        moto.park();
        assertEquals(0, ((Motorcycle) moto).getSpeed());
    }

}