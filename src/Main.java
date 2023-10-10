import com.sun.jdi.CharValue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Car,Car1> hashMap = new HashMap<>();
        hashMap.put(new Car(12,777),new Car1(2009,"BMW x5",40000,"black"));
        hashMap.put(new Car(13,888),new Car1(2012,"Mersedes bananana",36000,"metal"));
        hashMap.put(new Car(14,999),new Car1(2021,"audi",10000,"white"));
        hashMap.put(new Car(15,111),new Car1(2011,"nissan r34",30000,"grey"));
        for (Map.Entry car: hashMap.entrySet()) {
            System.out.println(car);

        }

        int kayUser = scanner.nextInt();
        for (Map.Entry entry: hashMap.entrySet()) {
            Car key = (Car) entry.getKey();
            Car1 value = (Car1) entry.getValue();
            if (kayUser == key.getId()){
                System.out.println(key +" "+value);
                break;
            }
        }
    }
}