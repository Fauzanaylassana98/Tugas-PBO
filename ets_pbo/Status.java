package com.mycompany.ets_pbo;

class Status {
    private int code;
    private String description;
    
    public Status(){
        this.code = 0;
        this.description = "OK";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
