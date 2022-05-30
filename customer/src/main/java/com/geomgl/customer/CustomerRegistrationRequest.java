package com.geomgl.customer;

public class CustomerRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;

    public CustomerRegistrationRequest(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public CustomerRegistrationRequest() { }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
