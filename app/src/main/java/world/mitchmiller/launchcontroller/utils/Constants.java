package world.mitchmiller.launchcontroller.utils;

/**
 * Created by Mitch Miller on 12/17/2017.
 */

public class Constants {

    // Message types sent from the BluetoothChatService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    // Key names received from the BluetoothChatService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";


    /**
     * Mass of the rocket M = (weight in ounces)/16/2.2 = (1.2+0.7) / 16 / 2.2 = 0.05398 kg
     Area of the rocket: A = pi*r^2 = 3.14*(0.5*0.976/12*0.3048)^2 = 0.000483 m^2
     Compute wind resistance factor: k = 0.5*rho*Cd*A = 0.5*1.2*0.75*0.000483 = 0.000217
     A C6 motor has a nominal impulse of 10 N-s and thrust of 6 N. The "rating" cited above applies to the impulse, giving us an actual impulse for an Estes C6 of 10*90% = 9 N-s.
     Compute the burn time t = I / T = 9 / 6 = 1.5 sec.
     The gravitational force = M*9.8 = 0.05398*9.8 = 0.529 newton 9.80665
     */
    public static final int MASS_OF_ROCKET = 0;

    public static final int MASS_OF_MOTOR = 0;

    public static final double PI = Math.PI;

    public static final double ACCELLERATION_DUE_TO_GRAVITY = 9.80665; // m/s^2

    public static final double AVERAGE_ROCKET_DRAG_COEFFICIENT = 0.75;

    public static final double AIR_DENSITY = 1.22; //kg/m^3 (rho)


    // Motor Constants

}
