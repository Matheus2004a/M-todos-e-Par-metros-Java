import java.util.Scanner;

//Nome do arquivo
public class Métodos{
    public static void main (String[] args){ //Corpo principal do programa
        Scanner teclado = new Scanner (System.in);
        Byte m = 0, num1 = 0, num2 = 0; //Variáveis do tipo decimal

        System.out.print("Entre com um número: ");
        num1 = teclado.nextByte();

        System.out.print("Entre com outro número: ");
        num2 = teclado.nextByte();

        m = media (num1, num2); //Os valores digitados são guardados aqui para serem referenciados no método media
        System.out.print("O valor da média é: " + m); //Imprimindo o cálculo da média feita no método media
    }

    //Chamando o método media criado no main e passando num1 e num2 como parâmetros a e b
    public static Byte media(Byte a, Byte b) {
        Byte media = 0;
        media = (byte) ((a + b) / 2); //Cálculo da média
        return (media); //Retornando a média pois é destruída no fim do método
    }
}