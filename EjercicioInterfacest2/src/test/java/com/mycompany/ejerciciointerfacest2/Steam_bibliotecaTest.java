/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejerciciointerfacest2;

import static com.mycompany.ejerciciointerfacest2.Steam_biblioteca.biblioteca;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillermo
 */
public class Steam_bibliotecaTest {
    
    @Test
    public void testaniadir(){
        int nhash = biblioteca.size();
        Juego j = new Juego("test","", "test", "test",1212);
        biblioteca.put(j.getNombrejuego(),j);
        assertTrue("No se agregan elementos al hashmap",nhash < biblioteca.size());
        biblioteca.remove(j.getNombrejuego());
    }
}
