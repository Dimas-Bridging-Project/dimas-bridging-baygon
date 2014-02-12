/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import org.dimas.bridging.retrieve.ParseTest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yhawin
 */
public class Test {
    
    public static void main(String [] args){
        ParseTest f = new ParseTest();
        try {
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/SALES.TXT");
            f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/STOCK.TXT");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
