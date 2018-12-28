package com.info.java.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by abhdogra1 on 12/27/2018.
 */
@Component
@PropertySource("test.properties")
@ConfigurationProperties(prefix = "org.test")
public class MyReadConfiguration {


    private String headOffice;
    private String PrimaryOffice;
    private String Post;
    private String Locations;

    public String getPrimaryOffice() {
        return PrimaryOffice;
    }

    public void setPrimaryOffice(String primaryOffice) {
        PrimaryOffice = primaryOffice;
    }

    public String getLocations() {
        return Locations;
    }

    public void setLocations(String locations) {
        Locations = locations;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }
}
