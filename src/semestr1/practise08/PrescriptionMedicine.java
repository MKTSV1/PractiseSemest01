package semestr1.practise08;

public class PrescriptionMedicine extends Medicine{
    private String doctorLicense;
    public PrescriptionMedicine(String name, double price, boolean isExpired, String  doctorLicense){
        super(name,price,isExpired);
        this.doctorLicense = doctorLicense;
    }
    public boolean canSell(boolean hasPrescription){
        return hasPrescription && getIsExpired();
    }
    @Override
    public String toString() {
        return super.toString() + " Докторська ліцензія " + doctorLicense;
    }
}
