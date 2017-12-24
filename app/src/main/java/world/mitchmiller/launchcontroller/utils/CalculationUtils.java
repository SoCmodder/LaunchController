package world.mitchmiller.launchcontroller.utils;

/**
 * Created by Mitch Miller on 12/23/2017.
 */

/**
 * Mass of the rocket M = (weight in ounces)/16/2.2 = (1.2+0.7) / 16 / 2.2 = 0.05398 kg
 Area of the rocket: A = pi*r^2 = 3.14*(0.5*0.976/12*0.3048)^2 = 0.000483 m^2
 Compute wind resistance factor: k = 0.5*rho*Cd*A = 0.5*1.2*0.75*0.000483 = 0.000217
 A C6 motor has a nominal impulse of 10 N-s and thrust of 6 N. The "rating" cited above applies to the impulse, giving us an actual impulse for an Estes C6 of 10*90% = 9 N-s.
 The gravitational force = M*9.8 = 0.05398*9.8 = 0.529 newton

 m = rocket mass in kg (see below)
 g = acceleration of gravity = 9.81 m/s2
 A = rocket cross-sectional area in m2
 Cd = drag coefficient = 0.75 for average rocket
 r (rho) = air density = 1.22 kg/m3
 t = motor burn time in seconds (NOTE: little t)
 T = motor thrust in Newtons (NOTE: big T)
 I = motor impulse in Newton-seconds
 v = burnout velocity in m/s
 y1 = altitude at burnout
 yc = coasting distance
 Note that the peak altitude is y1 + yc
 ta = coasting time => delay time for motor
 */
public class CalculationUtils {

    public static double calculateEmptyMass() {
        return Constants.MASS_OF_ROCKET / 16 / 2.2;
    }

    public static double calculateEmptyMassFromWeightInOunces(double ounces) {
        return ounces / 16 / 2.2;
    }

    public static double calculateMassOfRocket(){
        return (Constants.MASS_OF_ROCKET + Constants.MASS_OF_MOTOR) / 16 / 2.2;
    }

    public static double calculateMassFromWeightInOunces(double ounces, double motorWeightInOunces) {
        return (ounces + motorWeightInOunces) / 16 / 2.2;
    }

    public static double calculateGravitationalForce(double massInKg) {
        return massInKg * Constants.ACCELLERATION_DUE_TO_GRAVITY;
    }

    public static double calculateAreaOfRocket(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateWindResistanceFactor(double areaInMetersSquared) {
        return (0.5) * Constants.AIR_DENSITY * Constants.AVERAGE_ROCKET_DRAG_COEFFICIENT * areaInMetersSquared;
    }

    // Compute the burn time t = I / T = 9 / 6 = 1.5 sec.
    public static double calculateBurnTime(double motorImpulseInNewtonSeconds, double motorThrustInNewtons) {
        return motorImpulseInNewtonSeconds / motorThrustInNewtons;
    }
}
