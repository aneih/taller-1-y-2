/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;




/**
 *
 * @author Master PC
 */
public class arrays {
    
    //atributos
    
    
   
    
    //metodos
    public int[] tamano(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array");
        int tn=sc.nextInt();
        int N[]=new int [tn];
        return N;
    }
    public void crear(int N[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Desea los numeros
                           1.Aleatorios
                           2.Ingresados""");
        
        int aleatorio=sc.nextInt();
        if (aleatorio==1) {
            System.out.println("Que rango desea");
            int max=maximo();
            int min=minimo();
            int rango = max - min + 1;
            for (int i = 0; i < N.length; i++) {
            //System.out.println("ingrese el numero "+(i+1));
            N[i]=(int)((Math.random()*rango)+min);
        }
        }
        else{
            for (int i = 0; i < N.length; i++) {
                System.out.println("ingrese el numero "+(i+1));
                N[i]=sc.nextInt();
            }
        }
    }
    public int maximo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El maximo numero");
        int max = sc.nextInt();
        return max;
    }
    public int minimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El minimo numero");
        int min = sc.nextInt();
        return min;
    }
    public void mostrar(int N[]){
        System.out.println("Mostrando");
        for (int i = 0; i < N.length; i++) {
           System.out.println("El indice "+i+" es el numero: "+N[i]); 
        }
        }
    public int aleatorio(){
        int rand = (int)(Math.random());
        return rand;
    }
    
    public int suma(int N[]){
        int suma=0;
        for (int i = 0; i < N.length; i++) {
           suma+=N[i];
             
        }
        return suma;
    }
    public int media(int N[]){
        int suma=0;
        int media;
        for (int i = 0; i < N.length; i++) {
           suma+=N[i];
             
        }
        media=suma/N.length;
        return media;
    }
    public int[] primo(){
        int con=0;
        int con2=0;
       
        int max=maximo();
        int numero;
        for (numero = 1; numero < max; numero++) {
            for (int i = 1; i <= numero; i++){
                if (numero % i == 0){
                    con++;
                    //System.out.println(numero+"-"+con);
                }
            }
            
            if (con==2) {
                //System.out.println(numero);
                con2++;
            }
            con=0;
            
               
            
            
            
        }
        
        
        //int Q[]=new int [con];
        System.out.println(con2);
        con=0;
        int l=0;
        int M[]=new int [con2];
        int numero2;
        for (numero2 = 1; numero2 < max; numero2++) {
            for (int i = 1; i <= numero; i++){
                if (numero2 % i == 0){
                    con++;
                    //System.out.println(numero2+"-"+con);
                }
            } 
            if (con==2) {
                    //System.out.println("numero2"+numero2);
                    M[l]=numero2;
                    //System.out.println(M[l]);
                    l++;
                    
            }
            con=0;
        }
        return M;
        
    }
    public int maximoprimo(int  M[]){
        int R[]=M;
        
        int mem;
        
        for (int j = 0; j < R.length; j++) {
            for (int i = 0; i < R.length-1; i++) {
                if (R[i]<R[i+1]) {
                    mem=R[i];
                    R[i]=R[i+1];
                    R[i+1]=mem;
                }
                
            }
            
        }
        int r=R[0];
        return r;
    }
    public int[] primos(int M[]){
    int T[]=tamano();
    int a;
        for (int i = 0; i < T.length; i++) {
            a=(int)((Math.random()*(M.length-1))+1);
            T[i]=M[a];
        }
    return T;
    }
    public int[] multipliarrays(int A1[],int A2[]){
    int A3[]=new int[A1.length];
        for (int i = 0; i < A1.length; i++) {
            A3[i]=A1[i]*A2[i];
        }
    return A3;
    }
    public int[] igualar(int A1[]){
        int A2[]=new int[A1.length];
        System.arraycopy(A1, 0, A2, 0, A1.length);
        return A2;
    }
    
    public int[] terminadoen(int tam[]){
        System.out.println("que ultimo digito desea");
        Scanner sc = new Scanner(System.in);
        int u =sc.nextInt();
        int T[]=new int[tam.length];
        int operacion;
        for (int i = 0; i < tam.length; i++) {
            operacion=tam[i]-((tam[i]/10)*10);
            
            if (operacion==u) {
                System.out.println(tam[i]);
                
            }
        }
        
        return T;
    }
    
    public void DNI(){
    int r;
    
    System.out.println("Ingrese su dni");
    Scanner sc = new Scanner(System.in);
    int dni =sc.nextInt();
    r=dni%23;
    
    char letras[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                   'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                   'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    char letra=letras[r];
        System.out.println("Tu DNI es " +dni+" y letra "+letra);
    
    }
    public String[] crearalum(){
        String N[]=new String [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N.length; i++) {
                System.out.println("ingrese el nombre del alumno "+(i+1));
                N[i]= sc.nextLine();
            }
        return N;
    }
    public void combinar(String N[], int n[]){   
        
        String resultado[]=new String[n.length];
        for(int i=0;i<n.length;i++){
        switch((int)n[i]){
                case 1, 2, 3, 4 -> resultado[i]="Suspendido";
                case 5, 6 -> resultado[i]="Bien";
                case 7, 8 -> resultado[i]="Notable";
                case 9, 10 -> resultado[i]="Sobresaliente";
            }
        
        
          System.out.println("El esturiante "+N[i]+" tiene una nota "+n[i]+" por lo cual es: "+resultado[i]);  
        }
    }
}



