/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgrm1;

/**
 *
 * @author POOJHA KEERTHI
 */
public class fibonacciseries {
    public static void main(String[] args){
        int a=1;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
    }
    
}
