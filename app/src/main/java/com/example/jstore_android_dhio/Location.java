package com.example.jstore_android_dhio;

public class Location {
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * get location province
     * @return    location's province
     */
    public String getProvince()
    {
        return province;
    }

    /**
     * get location city
     * @return    location's city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * get location description
     * @return    location's description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * set location province
     * @param   province   location's province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }

    /**
     * set location city
     * @param   city   location's city
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * set location description
     * @param   description   location's description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
}
