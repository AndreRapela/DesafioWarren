//PRIMEIRA QUESTÃO DO DESAFIO WARREN
package warren01;

public class Warren01 {

    
      public static int inverter(int n) {
    int resultado = 0;
    while (n > 0) {
        resultado = 10 * resultado + n % 10;
        n /= 10;
    }
    return resultado;
}

    public static void main(String[] args) {
    int cont = 0;
   
    for (int i = 0; i < 1000000; i++) {
        
        int res = i + inverter(i);
        if ((i<inverter(i))&&(res % 2 != 0)) {
            if (res<1000000){
                System.out.println(i+" + "+inverter(i)+" = "+ res);
                cont++;
            }
        }
    }
    System.out.println(cont);
    }
    
    }

