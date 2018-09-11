
package me.edraki.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Guest {


    @JsonProperty("id")
    public Integer id;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("picture_url")
    public String pictureUrl;
    @JsonProperty("location")
    public String location;
    @JsonProperty("phone")
    public String phone;

}
