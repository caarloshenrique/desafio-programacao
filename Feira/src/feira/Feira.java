package feira;

import java.util.HashMap;
import java.util.Scanner;

public class Feira {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
           int N = sc.nextInt();
             
           for (int i = 0; i < N; i++) {
                int M = sc.nextInt();
               
                HashMap<String, Double> lista = new HashMap<>();
                for (int j = 0; j < M; j++) {
                    String produto = sc.next();
                    double valor = sc.nextDouble();
                    lista.put(produto, valor);
                }
                
                double total = 0;
                int P = sc.nextInt(); 
                for (int p = 0; p < P; p++) {
                    String produto = sc.next();
                    int qt = sc.nextInt();
                    total += lista.get(produto) * qt;
                }
           
                System.out.printf("R$ %.2f\n", total);
           }
       }
}
