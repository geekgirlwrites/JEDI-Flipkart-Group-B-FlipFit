package com.flipkart.business;

import com.flipkart.bean.GymOwner;

import java.util.List;

public class AdminService implements AdminInterface {
    public boolean approveGymOwner (String gymOwnerId, boolean status) {
        //method for call at dao layer to set the status of the gymOwnerId
        return false;
    }

    public List<GymOwner> viewNonApprovedSlots() {
        //method to call all pending ownerId
        return null;
    }

    @Override
    public boolean changePassword(String userName, String oldPassword, String newPassword) {
        return true;
    }

    @Override
    public void login(String userName, String password) {
        return;
    }
}
