package matricula;

import java.util.HashMap;
import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int N = sc.nextInt();
            HashMap<String, Integer> mapa = new HashMap<>();
            
            for (int i = 0; i < N; i++) {
                String nome = sc.next();
                int idade = sc.nextInt();
                mapa.put(nome, idade);
            }
            
            N = sc.nextInt();
            for (int i = 0; i < N; i++) {
               String busca = sc.next();
               Integer valor = mapa.get(busca);
               if(valor == null) {
                   System.out.println("Não matriculado");
               } else {
                   System.out.print(mapa.get(busca));
                   System.out.println(" anos");
               }
            }
            break;
        }
    }
}
