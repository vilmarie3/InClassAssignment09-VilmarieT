package com.example.android.inclassassignment09_vilmariet;

public class ThreeLittlePigs {
    private String houseMaterial;
    private int houseNumber;
    private boolean blownDown;


    public ThreeLittlePigs(){

    }


    public String getHouseMaterial() {
        return houseMaterial;
    }

    public void setHouseMaterial(String houseMaterial) {
        this.houseMaterial = houseMaterial;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public boolean isBlownDown() {
        return blownDown;
    }

    public void setBlownDown(boolean blownDown) {
        this.blownDown = blownDown;
    }

    public ThreeLittlePigs (String houseMaterial, int houseNumber, boolean blownDown){
        this.blownDown = blownDown;
        this.houseMaterial = houseMaterial;
        this.houseNumber = houseNumber;
    }
}
