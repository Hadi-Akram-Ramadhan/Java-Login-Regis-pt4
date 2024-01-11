/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hadi_XIPPLG2;

/**
 *
 * @author kkhad
 */
public class UserID {
    
    
    private static String nama, nik;
    
    public static void setNama(String nama){
        UserID.nama = nama;
    }
    public static void setNik(String nik){
        UserID.nik = nik;   
    }
    public static String getNik(){
        return nik;
    }
    public static String getNama(){
        return nama;
    }
}
