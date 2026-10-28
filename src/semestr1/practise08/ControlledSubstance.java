package semestr1.practise08;

public class ControlledSubstance extends PrescriptionMedicine{
    private int patientAge;
    public ControlledSubstance(String name,  double price, boolean isExpired, String doctorLicense, int patientAge){
        super(name,price,isExpired,doctorLicense);
        this.patientAge = patientAge;
    }
    public boolean canSell(boolean hasPrescription) {
      return super.canSell(hasPrescription) && patientAge >=18;
    }

    @Override
    public String toString() {
        return super.toString() + " Вік пацієнта " + patientAge;
    }
}
