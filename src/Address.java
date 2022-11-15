public class Address {
    double latitude;
    double longtitude;
    String written_address;

    public Address(double a, double b, String c) {
        this.latitude = a;
        this.longtitude = b;
        this.written_address = c;
    }

    double distance_from(Address address) {
        // The math module contains a function
        // named toRadians which converts from
        // degrees to radians.
        double lon1 = Math.toRadians(this.longtitude);
        double lon2 = Math.toRadians(address.longtitude);
        double lat1 = Math.toRadians(this.latitude);
        double lat2 = Math.toRadians(address.latitude);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                        * Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return (c * r);
    }
}