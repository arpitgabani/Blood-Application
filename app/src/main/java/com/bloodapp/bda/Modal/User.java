package com.bloodapp.bda.Modal;

public class User {

    String name, bloodgroup, id, email, idnumber, phonenumber, /*cityName,*/ profilepictureurl, search, type;

    public User() {
    }


    public User( String name, String bloodgroup, String id, String email, String idnumber, String phonenumber, /*String cityName,*/ String profilepictureurl, String search, String type ) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.id = id;
        this.email = email;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
       // this.cityName = cityName;
        this.profilepictureurl = profilepictureurl;
        this.search = search;
        this.type = type;
    }

    public String getName() { return name; }

    public void setName( String name ) { this.name = name; }

    public String getBloodgroup() { return bloodgroup; }

    public void setBloodgroup( String bloodgroup ) { this.bloodgroup = bloodgroup; }

    public String getId() { return id; }

    public void setId( String id ) { this.id = id; }

    public String getEmail() { return email; }

    public void setEmail( String email ) { this.email = email; }

    public String getIdnumber() { return idnumber; }

    public void setIdnumber( String idnumber ) { this.idnumber = idnumber; }

    public String getPhonenumber() { return phonenumber; }

    public void setPhonenumber( String phonenumber ) { this.phonenumber = phonenumber; }

//    public String getCityName() { return cityName; }
//
//    public void setCityName( String cityName ) {
//        this.cityName = cityName;
//    }

    public String getProfilepictureurl() { return profilepictureurl; }

    public void setProfilepictureurl( String profilepictureurl ) {
        this.profilepictureurl = profilepictureurl;
    }

    public String getSearch() { return search; }

    public void setSearch( String search ) { this.search = search; }

    public String getType() { return type; }

    public void setType( String type ) { this.type = type; }
}
