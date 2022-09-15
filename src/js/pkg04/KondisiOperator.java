/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg04;

/**
 *
 * created by 21343002_Aini Rizkina
 */
public class KondisiOperator {
    public static void main (String[] argh){
        String status = "";
        int grade = 50;
        
        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}
