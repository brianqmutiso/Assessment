/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Johnstone
 */
public class MissingValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define the array and initialize
        int[] ar={3,5,4,1};
        //get maximum value of array
        int max=getMaxxArrayVal(ar);
        //get minimum value of array
        int min=getMinArrayVal(ar);
        //output the missing value to the user
        System.out.println(getMissingValue(max,min,ar));
    }
   //function to return  maximum value of array
    public static int getMaxxArrayVal(int [] ar){
        int maximumvalue=ar[0];
      
        for(int i=0;i<ar.length;i++){
        if(ar[i]>maximumvalue){
       maximumvalue=ar[i];
        }
        }
        return maximumvalue;
    }
    //function to return minimum value of array
    public static int getMinArrayVal(int ar[]){
        int minimumValue=ar[0];
        for(int i=0;i<ar.length;i++){
        if(ar[i]<minimumValue){
        minimumValue=ar[i];
        }
        }
        return minimumValue;
    }
    //return missing value of array
    public static int getMissingValue(int maximum,int minimum, int [] ar){
        int missingValue=0;
        
        List p=new ArrayList();
        for(int i=minimum;i<=maximum;i++){
            p.add(i);
        }
        List<Integer> presentValues = new ArrayList<Integer>();
        for(int val:ar) {
           presentValues.add(val);
        }
        
        for(int i=0;i<p.size();i++){
        if(!presentValues.contains(p.get(i))){
       missingValue=Integer.parseInt(p.get(i).toString());
        }
        }
       
        return missingValue;
    }
    
    
}
