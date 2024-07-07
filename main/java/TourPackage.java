package src.main.java;

public class TourPackage implements Comparable<TourPackage>{
    private int packageId;
    private String destination;
    private int price;
    
    public TourPackage(int packageId , String destination , int price){
        this.packageId = packageId;
        this.destination = destination;
        this.price = price;
    }

    public int getPackageId(){
        return packageId;
    }
    public String getDestination(){
        return destination;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public int compareTo(TourPackage t1){
        if(t1.getDestination().equals(getDestination())){
            return 0;
        }else if((t1.getDestination().compareTo(getDestination()))<0 ){
            return 1;
        }else{
            return -1;
        }

    }
}
