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
        double radius = 6371000;

        double latDelta = Math.toRadians(Math.abs(this.latitude - other.latitude));
        double lonDelta = Math.toRadians(Math.abs(this.longitude - other.longitude));
        double a = Math.sin(latDelta / 2) * Math.sin(latDelta / 2)
                + Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.latitude))
                * Math.sin(lonDelta / 2) * Math.sin(lonDelta / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return radius * c;
    }
}
