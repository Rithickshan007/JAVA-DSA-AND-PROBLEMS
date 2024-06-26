/*
Problem Statement: Given the number of tyres and vehicles - How many two-wheelers
and four-wheelers can be formed...
*/
package NumberProblems;

import java.util.*;

class WheelsOfVehicles{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int wheels=in.nextInt();
        int vehicles=in.nextInt();
        int tw=((4*vehicles)-wheels)/2; //For finding no.of two-wheelers
        if(wheels>=2 &&(wheels%2==0) && wheels>vehicles)
            System.out.printf("tw= %d fw= %d",tw,vehicles-tw);
        else
            System.out.println("invalid");
    }
}
