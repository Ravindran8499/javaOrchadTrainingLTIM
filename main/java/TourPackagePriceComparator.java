package src.main.java;


import java.util.*;
class PriceComparator implements Comparator<TourPackage>{
    @Override
    public int compare(TourPackage t1 , TourPackage t2){
        if(t1.getPrice()  == t2.getPrice()){
            return 0;
        }else if(t1.getPrice()  > t2.getPrice()){
            return 1;
        }else{
            return -1;
        }

    }

}