package semestr1.practise09;

public class DeliveryAddress {
    private String city;
    private String street;
    private int postOfficeNumber;
    public DeliveryAddress(String city,String street,int postOfficeNumber){
        this.city =city;
        this.street=street;
        this.postOfficeNumber=postOfficeNumber;
        if(postOfficeNumber <0){
            this.postOfficeNumber =0;
        }
    }

    @Override
    public String toString() {
        return String.format("Місто: %s | Вулиця: %s | Номер поштового відділення: %d",city,street,postOfficeNumber);
    }
}
