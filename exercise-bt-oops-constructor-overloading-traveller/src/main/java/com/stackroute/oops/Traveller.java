package com.stackroute.oops;

import java.util.List;

public class Traveller {
    private int id;
    private String travelType;
    private double price;
    private List<String> locations;

    public Traveller() {
    }

    public Traveller(int id) {
        this.id = id;
    }

    public Traveller(int id, String travelType) {
        this.id = id;
        this.travelType = travelType;
    }

    public Traveller(int id, String travelType, double price) {
        this.id = id;
        this.travelType = travelType;
        this.price = price;
    }

    public Traveller(int id, String travelType, double price, List<String> locations) {
        this.id = id;
        this.travelType = travelType;
        this.price = price;
        this.locations = locations;
    }

    /* Getter  methods */
    public int getId() {
        return id;
    }


    public String getTravelType() {
        return travelType;
    }


    public double getPrice() {
        return price;
    }


    public List<String> getLocations() {
        return locations;
    }

    public String getTravellerDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traveller{id=").append(id)
                .append(", price=").append(price)
                .append(", travelType='").append(travelType).append('\'');
        if (locations != null) {
            sb.append(", locations=").append(locations);
        }
        sb.append('}');
        return sb.toString();
    }
}