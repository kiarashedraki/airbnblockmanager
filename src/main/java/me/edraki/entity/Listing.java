
package me.edraki.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Listing {


    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("address")
    public String address;
    @JsonProperty("picture_url")
    public String pictureUrl;
    @JsonProperty("lat")
    public Double lat;
    @JsonProperty("lng")
    public Double lng;

}
