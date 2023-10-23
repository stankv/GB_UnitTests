package VehicleTest;

import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.Vehicle;


class VehicleTest {
    
    // - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void checkObjectCarIsInstanceOfVehile(){
        Car renault = new Car("Renault", "Sandero", 2020);
        assertThat(renault).isInstanceOf(Vehicle.class);
    }


    // - проверка того, объект Car создается с 4-мя колесами
    @Test
    void checkObjectCarHaveFourWheels(){
        Car bmw = new Car("BMW", "X6", 2006);
        assertThat(bmw.getNumWheels()).isEqualTo(4);
    }

    // - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void checkObjectMotorcycleHaveTwoWheels(){
        Motorcycle kawasaki = new Motorcycle("Kawasaki", "Ninja 400R", 2011);
        assertThat(kawasaki.getNumWheels()).isEqualTo(2);
    }

    // - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void checkObjectCarCanAccelerateTo60kmphInTestDrive(){
        Car audi = new Car("Audi", "Q7", 2019);
        audi.testDrive();
        assertThat(audi.getSpeed()).isEqualTo(60);
    }
   
    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void checkObjectMotorcyclerCanAccelerateTo75kmphInTestDrive(){
        Motorcycle honda = new Motorcycle("Honda", "CB400", 2019);
        honda.testDrive();
        assertThat(honda.getSpeed()).isEqualTo(75);
    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) 
    // машина останавливается (speed = 0)
    @Test
    void checkObjectCarHaveZeroSpeedInParckingMode(){
        Car mercedes = new Car("Mercedes", "S500", 2018);
        mercedes.testDrive();
        mercedes.park();
        assertThat(mercedes.getSpeed()).isEqualTo(0);
    }
   
    // - проверить, что в режиме парковки (сначала testDrive, потом park т.е эмуляция движения транспорта) 
    // мотоцикл останавливается (speed = 0)
    @Test
    void checkObjectMotorcycleHaveZeroSpeedInParckingMode(){
        Motorcycle yamaha = new Motorcycle("Yamaha", "350", 2010);
        yamaha.testDrive();
        yamaha.park();
        assertThat(yamaha.getSpeed()).isEqualTo(0);
    }

}