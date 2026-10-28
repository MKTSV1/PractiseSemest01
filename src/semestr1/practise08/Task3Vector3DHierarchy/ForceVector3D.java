package semestr1.practise08.Task3Vector3DHierarchy;

public class ForceVector3D extends Vector3D{
    private String forceName;
    public ForceVector3D(String forceName,double fx, double fy, double fz){
        super(fx,fy,fz);
        this.forceName = forceName;
    }
    public double calculateWork(Vector3D displacement){
        return super.dotProduct(displacement);
    }
    public double calculateAcceleration(double massKg){
        if (massKg <= 0){
            return 0.0;
        }
        return getLength() / massKg;
    }
     @Override public String toString(){
         return String.format("Force[name = '%s', Vector3D(%.2f; %.2f; %.2f) |F|=%.2f Н]",forceName,getX(),getY(),getZ(),getLength());
     }
}