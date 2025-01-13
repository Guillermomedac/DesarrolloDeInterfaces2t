/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointerfacest2;

/**
 *
 * @author tanuk
 */
public class Juego {
    
  String nombrejuego;
  boolean jugando;
  String imagen;
  String autor;
  String genero;
  int publicacion;
  
  
  public Juego(String nombrejuego, String imagen, String autor, String genero, int publicado){
      this.nombrejuego = nombrejuego;
      this.jugando = false;
      this.imagen = imagen;
      this.autor = autor;
      this.genero = genero;
      this.publicacion = publicacion;
  }

    public String getNombrejuego() {
        return nombrejuego;
    }

    public boolean isJugando() {
        return jugando;
    }

    public String getImagen() {
        return imagen;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }
  
}
