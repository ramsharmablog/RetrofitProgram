
package com.aarogya.pro.retrofitprogram.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Developer {

    @SerializedName("follower_id")
    @Expose
    private String followerId;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("user_fullname")
    @Expose
    private String userFullname;
    @SerializedName("user_image")
    @Expose
    private String userImage;
    @SerializedName("user_badget")
    @Expose
    private String userBadget;
    @SerializedName("user_cat")
    @Expose
    private String userCat;
    @SerializedName("total")
    @Expose
    private String total;

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserBadget() {
        return userBadget;
    }

    public void setUserBadget(String userBadget) {
        this.userBadget = userBadget;
    }

    public String getUserCat() {
        return userCat;
    }

    public void setUserCat(String userCat) {
        this.userCat = userCat;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
