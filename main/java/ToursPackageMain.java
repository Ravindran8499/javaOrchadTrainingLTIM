package src.main.java;
import java.util.*;
public class ToursPackageMain {
    
    public static void printList(ArrayList<TourPackage> list){
        for(TourPackage t :list){
            System.out.println("id: " + t.getPackageId() + " " + "destination: " + t.getDestination() + " " + "price: "+t.getPrice()+ " ");
        }
    }

    public static void main(String[] args) {
        // System.out.println("");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<TourPackage> list = new ArrayList<TourPackage>();
        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            String destination = sc.next();
            int price = sc.nextInt();
            TourPackage t = new TourPackage(id , destination , price);
            list.add(t);
        }
        System.out.println("***Sorting According to destination using comparable***");
        Collections.sort(list);
        printList(list);

        System.out.println("***Sorting According to Price using comparator***");
        Collections.sort(list , new PriceComparator());
        printList(list);
        sc.close(); 
    }
}
