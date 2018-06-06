/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcredito.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JUAN G
 */
public class JPAFactory {
    private static final String UP="com.mycompany_AppCreditos_war_1.0-SNAPSHOTPU";
    private static final EntityManagerFactory FACTORY;
    
    static{
        FACTORY= Persistence.createEntityManagerFactory(UP);
    }

    public static EntityManagerFactory getFACTORY() {
        return FACTORY;
    }
    
}
