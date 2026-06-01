package tacos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

@Document(collection = "users")
public class User implements UserDetails {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public User() {}

    public User(String username, String password, String fullname,
                String street, String city, String state,
                String zip, String phoneNumber) {
        this.username    = username;
        this.password    = password;
        this.fullname    = fullname;
        this.street      = street;
        this.city        = city;
        this.state       = state;
        this.zip         = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override public String  getUsername()                { return username; }
    @Override public String  getPassword()                { return password; }
    @Override public boolean isAccountNonExpired()        { return true; }
    @Override public boolean isAccountNonLocked()         { return true; }
    @Override public boolean isCredentialsNonExpired()    { return true; }
    @Override public boolean isEnabled()                  { return true; }

    public String getId()          { return id; }
    public String getFullname()    { return fullname; }
    public String getStreet()      { return street; }
    public String getCity()        { return city; }
    public String getState()       { return state; }
    public String getZip()         { return zip; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setUsername(String username)       { this.username = username; }
    public void setPassword(String password)       { this.password = password; }
    public void setFullname(String fullname)       { this.fullname = fullname; }
    public void setStreet(String street)           { this.street = street; }
    public void setCity(String city)               { this.city = city; }
    public void setState(String state)             { this.state = state; }
    public void setZip(String zip)                 { this.zip = zip; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
