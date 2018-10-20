package hautzy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calc {

    DecimalFormat format = new DecimalFormat("0.000");

    // Constant Values (all in m/s)
    private final double VS1 = 4.361702128;
    private final double VS2 = 6.029411765;
    private final double VS3 = 7.068965517;
    private final double gravity = 9.81;    // (m/s^2)

    // Dependent Variables
    private double VY, VX, time, distance;

    public Calc(int opt, double theta) {

        System.out.println(opt);

        double VResultant = 0;

        if(opt == 1)
            VResultant = VS1;
        if(opt == 2)
            VResultant = VS2;
        if(opt == 3)
            VResultant = VS3;

        //  Find VY
        VY = Math.sin(Math.toRadians(theta)) * VResultant;

        //  Find time
        time = 2 * (VY / gravity);

        //  Find VX
        VX = Math.cos(Math.toRadians(theta)) * VResultant;

        //  Find X
        distance = VX * time;

        System.out.println(VResultant);

    }

    // Returns distance in meters (000.000)
    public String getDistance() {return format.format(distance);}
}