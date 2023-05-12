/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1poomichaelriera;

/**
 *
    * @author Michael Riera
 */
public class Practica1PooMichaelRiera {

    /**
     * @crear objetos 
     */
    public static void main(String[] args) {
     Computador computador1=  new Computador();
     computador1.tarjetaMadre="Gigabyte";
     computador1.ram="DDR4";
     computador1.discoDuro="SD M2";
     computador1.fuentePoder="DCIM";
     computador1.procesador="Intel Core i9 de 10m generacion";
     /////////////////////////////////////////////////////////
     Celular celular1= new Celular();
     celular1.pantalla="Amoled";
     celular1.bateria="Litio";
     celular1.procesador1="SnapDragon Gen 1";     
     celular1.camara="Sony vision 2.43";
     celular1.altavoces="Bose";
     ////////////////////////////////////////////////////////
     Bus bus1= new Bus();
     bus1.marca="HINO";
     bus1.modelo="AK";
     bus1.anio="2009";
     bus1.carroceria="IMCE";
     bus1.motor="6.2 Litros";
     ////////////////////////////////////////////////////////
     System.out.println("============================================");
     System.out.println("    Practica 1 Creación de clases 12/05/09");
      System.out.println("          MICHAEL RIERA ITIN 10392");
     System.out.println("            CLASE 1 -- COMPUTADOR  ");
     System.out.println("============================================");
     System.out.println("Tarjeta madre: "+computador1.tarjetaMadre);
      System.out.println("Memoria Ram: "+computador1.ram);
       System.out.println("Disco duro: "+computador1.discoDuro);
        System.out.println("Fuente de Poder: " +computador1.fuentePoder);
         System.out.println("Procesador: "+computador1.procesador);
    
     /////////////////////////////////////////////////////////////////////////////////
     System.out.println("============================================");
     System.out.println("             CLASE 2 -- CELULAR  ");
     System.out.println("============================================");
      System.out.println("Tipo de pantalla: "+celular1.pantalla);
      System.out.println("Tipo de bateria: "+celular1.bateria);
       System.out.println("Procesador: "+celular1.procesador1);
        System.out.println("Modelo de camara: "+celular1.camara);
         System.out.println("Tipo de altavoz: "+celular1.altavoces); 
     
      /////////////////////////////////////////////////////////////////////////////////
     System.out.println("============================================");
     System.out.println("              CLASE 3 -- BUS  ");
     System.out.println("============================================");
      System.out.println("Marca: "+bus1.marca);
      System.out.println("Modelo: "+bus1.modelo);
      System.out.println("Año de fabricacion: "+bus1.anio);
      System.out.println("Tipo de carroceria: "+bus1.carroceria);
      System.out.println("Cilindraje de motor: "+bus1.motor);
      System.out.println("============================================");
    }
    
}
