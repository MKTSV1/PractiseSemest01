package semestr1.practise09;

public class ImmutableGeoPoint {
    private final double latitude;
    private final double longitude;
    public ImmutableGeoPoint(double latitude, double longitude){
        this.latitude = Math.max(-90.0, Math.min(90.0, latitude));
        this.longitude =Math.max(-180.0, Math.min(180.0, longitude));
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public ImmutableGeoPoint shift(double dLAt, double dLon){
        double newLat = this.latitude + dLAt;
        double newLon = this.longitude + dLon;
        return  new ImmutableGeoPoint(newLat, newLon);
    }
    @Override public String toString(){
        return String.format("GeoPoint{lat=%.4f, lon=%.4f}", latitude, longitude);    }
}
