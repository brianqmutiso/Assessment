///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package first;
//
///**
// *
// * @author Johnstone
// */
//class mouseSteps {  
//    public static void main(String[] args) 
//    { 
//            int K = 21; 
//            System.out.println("Possible Routes that the mouse can take is " + getNumbuberOfWays(K)+" Ways"); 
//    } 
//	static double findFactorial(int K) 
//      { 
//        double result = 1.0; 
//        while (K > 0) { 
//                result = result * K; 
//                K--; 
//        } 
//        return result; 
//       } 
//
//    static long getNumbuberOfWays(int K) 
//    { 
//            double numUpper = findFactorial(K); 
//    
//            double NumLower = findFactorial(K-2);
//            return (int)(numUpper/NumLower) ;
//    } 
//
//    
//} 
//
