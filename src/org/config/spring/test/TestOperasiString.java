/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yhawin
 */
public class TestOperasiString {
    public static void main(String [] args){
        Date tanggal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
        System.out.println(sdf.format(tanggal));
        
 
    }
    
}
