package com.smartfood.user.enums;

public enum UserRole {
    CUSTOMER("customer"),
    RESTAURANT_OWNER("restaurantOwner"),
    ADMIN("admin");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String GetRole(){
        return role;
    }
}
