package inclassexercise;

public class Address {
    private String street;
    private String city;
    private String sate;
    private  String zip;
    public Address(){

    }
    public Address(String street,String city,String sate,String zip){
        this.street=street;
        this.city=city;
        this.sate=sate;
        this.zip=zip;


    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSate() {
        return sate;
    }

    public void setSate(String sate) {
        this.sate = sate;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
