package listaenlazadaconreferencias;

import java.util.Scanner;
import java.util.Random;

import listaenlazadaconreferencias.ListaEnlazada.NodoGeneric;


public class ListaEnlazadaConReferencias {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      char[] chars = "abcdfghijklmñnopqrstuvwxyz".toCharArray();
      int s =0;
      int r = 0;
      char c ;
      ListaEnlazada<Integer> Lista1 = new ListaEnlazada<>();
      ListaEnlazada<Integer> Lista2 = new ListaEnlazada<>();
      ListaEnlazada<Object> Lista3 = new ListaEnlazada<>();
      
      for(int i = 1 ; i<=1000000; i++){
          s = (int) (Math.random()*1000);
          r = (int) (Math.random()*6);
          c = chars[random.nextInt(chars.length)];
          Usuario Usuario1 = new Usuario(s,c,r);
          Lista1.PushFront(Usuario1.getIndentificacion()); 
      }
      
      System.out.println("Identidicacion de Cada Usuario");
      
      Lista1.PintSinRecursion();
    
      System.out.println("El Usuario Con mas Tiempo");
      System.out.println(Lista1.PopBack()); 
   
    }
    
}
