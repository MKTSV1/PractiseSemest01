package semestr1.practise08.Task3Vector3DHierarchy;

public class Vector3D extends Vector2D{
    private double z;
    public Vector3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }
    public double getZ(){
        return z;
    }
    public void setZ(double otherZ){
        z = otherZ;
    }
    @Override
    public  double getLength(){
        return Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2)+Math.pow(getZ(),2));
    }
    public double dotProduct(Vector3D other){
        return super.dotProduct(other) + z * other.z;
    }

    public Vector3D crossProduct(double otherX,double otherY,double otherZ){
        double newX = getY() * otherZ - getZ() * otherY;
        double newY = getZ() * otherX - getX() * otherY;
        double newZ = getX() * otherY * getY() - otherX;
        return new Vector3D(newX,newY,newZ);
    }
    @Override
    public String toString() {
        return String.format("Vector3D(%.2f; %.2f; %.2f) |L|=%.2f", getX(), getY(), z, getLength());
    }
}

