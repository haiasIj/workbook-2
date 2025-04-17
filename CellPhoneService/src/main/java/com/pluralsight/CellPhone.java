package com.pluralsight;

public class CellPhone {

    public class Phone {
        private int serialNumber;
        private String model;
        private String carrier;
        private int phoneNumber;
        private String owner;

        public Phone(int serialNumber, String model, String carrier, int phoneNumber, String owner) {
            this.serialNumber = serialNumber;
            this.model = model;
            this.carrier = carrier;
            this.phoneNumber = phoneNumber;
            this.owner = owner;
        }

        public int getSerialNumber() {
            return serialNumber;
        }

        public String getModel() {
            return model;
        }

        public String getCarrier() {
            return carrier;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public String getOwner() {
            return owner;
        }
    }




}