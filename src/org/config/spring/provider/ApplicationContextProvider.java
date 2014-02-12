/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.provider;

import java.io.File;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Saiful Bahri
 * blog    : http://bahrie27.wordpress.com/
 * twitter : @bahrie127
 */
public class ApplicationContextProvider {

    private ApplicationContext applicationContext;
    private ApplicationContext applicationContextMem;

    private ApplicationContext applicationContextOracle;

    public static ApplicationContextProvider getProvider() {
        return provider;
    }

    public static void setProvider(ApplicationContextProvider provider) {
        ApplicationContextProvider.provider = provider;
    }
    
    private static ApplicationContextProvider provider;

    private ApplicationContextProvider() throws ExceptionInInitializerError {
        try {
            this.applicationContext = new ClassPathXmlApplicationContext("org" + File.separator + 
                    "config" + File.separator +  "ApplicationContext.xml");                  
            this.applicationContextMem = new ClassPathXmlApplicationContext("org" + File.separator + 
                    "config" + File.separator +  "ApplicationContextMem.xml");                  
             
       } catch (Throwable ex) {
            System.err.print("error " + ex);
            //throw new ExceptionInInitializerError(ex);
        }
    }

    public synchronized static ApplicationContextProvider getInstance() throws ExceptionInInitializerError {
        ApplicationContextProvider tempProvider = null;
        if (provider == null) {
            provider = new ApplicationContextProvider();
            tempProvider = provider;
        }else if(provider.getApplicationContext()==null){
            provider=new ApplicationContextProvider();
            tempProvider=provider;
        }else{
            tempProvider=provider;
        }

        return tempProvider;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContextMem() {
        return applicationContextMem;
    }

    public void setApplicationContextMem(ApplicationContext applicationContextMem) {
        this.applicationContextMem = applicationContextMem;
    }

 
}
