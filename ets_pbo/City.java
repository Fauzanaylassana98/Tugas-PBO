package com.mycompany.ets_pbo;

class City {
    private String origin;
    private String destination;
    
    public City(String tujuan){
        this.origin = "BANDUNG";
        this.destination = tujuan;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
