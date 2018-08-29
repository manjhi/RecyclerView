package com.example.design;

import android.media.Image;

public class UserData {

    String Name;
    String Post;
    String Experience;
    String Location;
//    Image UserImage;

    public UserData(String name, String post, String experience, String location) {
        Name = name;
        Post = post;
        Experience = experience;
        Location = location;
//        UserImage = userImage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

//    public Image getUserImage() {
//        return UserImage;
//    }
//
//    public void setUserImage(Image userImage) {
//        UserImage = userImage;
//    }
}
