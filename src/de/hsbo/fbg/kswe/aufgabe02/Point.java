package de.hsbo.fbg.kswe.aufgabe02;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * POJO that represents a 2-dimensional point
 *
 * @author <a href="mailto:s.drost@52north.org">Sebastian Drost</a>
 */
public class Point {

    private final double latitude;
    private final double longitude;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Calculates the distance between two points
     *
     * @param other other pointy
     * @return the 2-dimensional distance
     */
    public double distanceTo(Point other) {
        double deltaLat = this.latitude - other.latitude;
        double deltaLon = this.longitude - other.longitude;

        return Math.sqrt((deltaLat * deltaLat) + (deltaLon * deltaLon)) * 100000;
    }
}
