
import java.util.Stack;

/*
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class DivisionExactaoNo {

  Stack<Boolean> pila = new
  Stack<Boolean>();
public void dividir(int numero1,int numero2){
     if(pila.push((boolean)((numero1%numero2==0)))){
         
         System.out.print ("La division " + numero1+"/"+numero2+"Es exacta ");
     }else{
         System.out.print("La Division "+ numero1+"/"+ numero2 + "No es exacta");}
     }
    }
    

