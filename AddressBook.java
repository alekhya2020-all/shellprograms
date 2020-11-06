/**
 * @author:Alekhya
 *
 * Address book
 */

import java.util.ArrayList;
public class AddressBook {

public String FirstName;
private String LastName;
private String Address;
private String City;
private String State;
private String Zip;
private String PhoneNumber;
static ArrayList <String> information = new ArrayList<String> ();

public AddressBook() {
        super();
    }

public AddressBook(String FirstName, String LastName,
       String Address,String City,String State,String Zip,String PhoneNumber, ArrayList<String> information) {
    super();
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Address=Address;
    this.City=City;
    this.State=State; 
    this.Zip=Zip;
    this.PhoneNumber = PhoneNumber;
    this.information = information;
}
public String getFirstName() {
    return FirstName;
}
public void setFirstName(String firstName) {
    this.FirstName = FirstName;
}
public String getLastName() {
    return LastName;
}
public void setLastName(String lastName) {
    this.LastName = LastName;
}
public String getAddress() {
    return Address;
}
public void setAddress(String Address) {
    this.Address = Address;
}
public String getCity() {
    return City;
}
public void setCity(String City) {
    this.City = City;
}
public String getState() {
    return State;
}
public void setState(String State) {
    this.State = State;
}
public String getZip() {
    return Zip;
}
public void setZip(String Zip) {
    this.Zip = Zip;
}
public String getPhoneNumber() {
    return PhoneNumber;
}
public void setPhoneNumber(String PhoneNumber) {
    this.PhoneNumber = PhoneNumber;
}
}

