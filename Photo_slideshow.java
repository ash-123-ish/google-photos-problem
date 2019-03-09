/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import static java.lang.Math.round;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author user
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashSet h=new LinkedHashSet();
        LinkedHashSet v=new LinkedHashSet();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String scape[]= new String[10];
        int tagno;
        TreeSet t[]=new TreeSet[10]; 
        for(int i=0;i<num;i++)
        {
        scape[i]=sc.next();
        tagno=sc.nextInt();
       t[i]=new TreeSet();
        for(int j=0;j<tagno;j++)
        {
            t[i].add(sc.next());
        }
        
        
        }
        
        for(int i=0;i<num;i++)
        {
            if(scape[i].equals("H"))
            {
               h.add(i);
            }
            else if(scape[i].equals("V"))
            {
               v.add(i);
            }
        }
        
        System.out.println(h);
        System.out.println(v);
        int sum_of_slideshow=round(h.size()+(v.size()/2));
        System.out.println("Total numnber of Slide Show is "+sum_of_slideshow);
       
    }
    
}
