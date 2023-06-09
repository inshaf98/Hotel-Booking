
package com.inzi.hotelbook.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    @SerializedName("user_hotel")
    @Expose
    private List<UserHotel> userHotels = new ArrayList<>();
    public List<UserHotel> getUserHotels() {
        return userHotels;
    }

    public void setUserHotels(List<UserHotel> userHotels) {
        this.userHotels = userHotels;
    }

}
