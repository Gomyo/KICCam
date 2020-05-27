abstract class Vehicle {
    private int curX, curY;
    public void reportPosition() {
        System.out.printf("현재 위치: (%d,%d)%n", curX,curY);
    }
    public abstract void addFuel();
}

class suv extends Vehicle {
    @Override
    public void addFuel() {
        System.out.println("주유소");
    }
}

class elec extends Vehicle {
    @Override
    public void addFuel() {
        System.out.println("급속 충전");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vs = {new suv(), new elec()};
        for (Vehicle v : vs) {
            v.addFuel();
            v.reportPosition();
        }
    }
}