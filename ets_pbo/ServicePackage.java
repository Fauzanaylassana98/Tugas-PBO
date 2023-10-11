package com.mycompany.ets_pbo;

class ServicePackage {
    private String service;
    private int value;
    
    public ServicePackage(int biaya){
        this.service = "REGULAR (REG)";
        this.value = biaya ; 
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
