package com.example.ridewithme.Classes;

public class Lonlat {

   private double currentLon;
   private double currentLat;
   private double destLon;
   private double destLat;

    public Lonlat() { }

    public Lonlat(double currentLon, double currentLat, double destLon, double destLat) {
        this.currentLon = currentLon;
        this.currentLat = currentLat;
        this.destLon = destLon;
        this.destLat = destLat;
    }

    public double getCurrentLon() {
        return currentLon;
    }

    public double getCurrentLat() {
        return currentLat;
    }

    public double getDestLon() {
        return destLon;
    }

    public double getDestLat() {
        return destLat;
    }

    public Lonlat setCurrentLon(double currentLon) {
        this.currentLon = currentLon;
        return this;
    }

    public Lonlat setCurrentLat(double currentLat) {
        this.currentLat = currentLat;
        return this;
    }

    public Lonlat setDestLon(double destLon) {
        this.destLon = destLon;
        return this;
    }

    public Lonlat setDestLat(double destLat) {
        this.destLat = destLat;
        return this;
    }
}



