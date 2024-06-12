import transportasi.*;

public class SUV extends Kendaraan {
    private int groundClearence;

    public SUV(int xLoc, int yLoc, String plateNum, double speed) {
        super(xLoc, yLoc, plateNum, speed);
        this.groundClearence = 0;
    }

    public int getGroundClearence() {
        return groundClearence;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "groundClearence=" + groundClearence +
                ", xLoc=" + getXLoc() +
                ", yLoc=" + getYLoc() +
                ", plateNum='" + getPlateNum() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}
