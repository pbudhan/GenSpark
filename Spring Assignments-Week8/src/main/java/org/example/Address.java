package org.example;

public class Address {
        private String city;
        private String state;
        private String country;
        private String zipcode;

        public Address() {
        }

        public String getCity() {
            return city;
        }
        public String getState() {
            return state;
        }
        public String getCountry() {
            return country;
        }
        public String getZipcode() {
            return zipcode;
        }

        public void setCity(String city2) {
            this.city = city2;
        }
        public void setState(String state2) {
            this.state = state2;
        }
        public void setCountry(String country2) {
            this.country = country2;
        }
        public void setZipcode(String zipcode2){
            this.zipcode = zipcode2;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country='" + country + '\'' +
                    ", zipcode='" + zipcode + '\'' +
                    '}';
        }
    }
