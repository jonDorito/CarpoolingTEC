package com.carpoolingtec.davidqs96.driverapp;


import java.util.Objects;

class Driver {

    private String name = "";
    private String surname = "";
    private String id = "";
    private String placeResidence = "";
    private boolean infoFilled = false;
    private String registeredWith = "none";

    public Driver() {
        checkInfoFilled();
    }

    public String getRegisteredWith() {
        return registeredWith;
    }

    public void setRegisteredWith(String registeredWith) {
        this.registeredWith = registeredWith;
    }

    public boolean isInfoFilled() {
        return infoFilled;
    }

    public void checkInfoFilled() {
        if ((Objects.equals(name, "") || Objects.equals(surname, "") || Objects.equals(id, "") || Objects.equals(placeResidence, ""))) {
            infoFilled = false;
        } else {
            infoFilled = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceResidence() {
        return placeResidence;
    }

    public void setPlaceResidence(String placeResidence) {
        this.placeResidence = placeResidence;
    }
}
