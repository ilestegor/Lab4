package car;

import place.*;
import exception.TankLevelException;
import interfaces.*;
import person.Human;


public class Car implements Rollable, Driveable, AbleToDestruct, AbleToFall {
    private String modelName;
    private Place locationOfVehicle;
    private boolean isInMotion;
    private TankLevel fuelInTank;

    public Car(String modelName, Place locationOfVehicle, boolean isInMotion, TankLevel fuelInTank) {
        this.modelName = modelName;
        this.locationOfVehicle = locationOfVehicle;
        this.isInMotion = isInMotion;
        this.fuelInTank = fuelInTank;
    }

    public boolean isInMotion() {
        return isInMotion;
    }

    public class Lever {
        private String name;
        private boolean isPulled;

        public Lever(String name, boolean isPulled) {
            this.name = name;
            this.isPulled = isPulled;
        }

        public void isPulled(Human human) {
            if (isPulled) {
                System.out.println(human.getName() + " тянет рычаг");
            }
        }
    }

    public class Pedal {
        private String name;
        private boolean isPressed;

        public Pedal(String name, boolean isPressed) {
            this.name = name;
            this.isPressed = isPressed;
        }

        public void isPressed(Human human) {
            if (isPressed) {
                System.out.println(human.getName() + " нажимает педаль");
            }
        }
    }

    public class SteeringWheel implements Grabable {
        private String name;
        private boolean isRotated;

        public SteeringWheel(String name, boolean isRotated) {
            this.name = name;
            this.isRotated = isRotated;
        }

        public void grab() {
            System.out.println("Незнайка начал поворачивать руль и носится по двору");
        }
    }

    public void setInMotion(Lever lever, Pedal pedal, Human human) {
        if (lever.isPulled & pedal.isPressed) {
            human.setInCar(true);
        }
    }

    public void validateTankLevel() throws TankLevelException {
        if (fuelInTank != TankLevel.EMPTY) {
            this.isInMotion = true;
            System.out.println("Машина может ехать");
            System.out.println("Машина пришла в движение");
        } else {
            throw new TankLevelException("В машине нет топлива, машина не может ехать");
        }
    }

    public void roll(String action, Place place) {
        System.out.println("Машина" + action + place.getName() + "y");
    }

    public void drive(Human human) {
        human.setInCar(true);
    }


    public void destruct(Destructable destructable) {
        if (isInMotion) {
            System.out.println("Машина разрушила беседку");
            destructable.destruct();
        }
    }


    public void fall(Fallable fallable) {
        System.out.printf(modelName);
        fallable.fall();
    }

    public TankLevel getFuelInTank() {
        return fuelInTank;
    }
}

