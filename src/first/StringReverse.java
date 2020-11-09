/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author Johnstone
 */
public class StringReverse {
    public static void main(String[] args) {
        //print the reversed string to the user
    System.out.println(Reverse("Lorem at"));
    }
    public static String Reverse(String s){
        //the desired string split length
        int desiredLength=4;
        int numberOfSubstrins=Integer.valueOf(String.valueOf(s.length()/desiredLength));
        if((Integer.valueOf(String.valueOf(s.length()))%desiredLength!=0)){
        numberOfSubstrins=numberOfSubstrins+1;
        }
        int j=0;
        StringBuilder strbuilder=new StringBuilder();
      
        for(int i=0;i<numberOfSubstrins;i++){ 
            String k="";
            if((s.length()-j)<4){
              k=s.substring(j,s.length()); 
            }
            else{
                  k=s.substring(j, j+4); 
            }
        
        StringBuilder strbuilder1=new StringBuilder(k);
        //function to reverse the string
         strbuilder.append(strbuilder1.reverse().toString());
         j=j+4;
        }
        
    return strbuilder.toString();
    }
}
