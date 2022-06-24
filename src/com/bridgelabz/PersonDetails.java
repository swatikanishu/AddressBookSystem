package com.bridgelabz;

public class PersonDetails {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private Integer zip;
        private String email;
        private Long phoneNumber;


        public PersonDetails(String firstName, String lastName, String address, String city, String state, Integer zip, String email, Long phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public PersonDetails() {
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setZip(Integer zip) {
            this.zip = zip;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "PersonDetails{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip=" + zip +
                    ", email='" + email + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    '}';
        }
    }




