import java.io.PrintStream;
import java.util.Scanner;

public class Exercicios {



    public PrintStream exercicioUmEscrevaDataDeNascimento(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        return System.out.printf("Ola, %s Você tem %s Anos \n", nome, idade);
    }
    public PrintStream exercicioTamanhoDeUmQuadrado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lado do Quadrado");
        System.out.println("Digite o valor de um lado  ");
        float base = input.nextFloat();
        System.out.println("Digite o valor do outro lado  ");
        float alturaa = input.nextFloat();
        float area = base * alturaa;
        return System.out.printf("Area é  %.2f\n", area);
    }
    public void exercicioComparandoIdade(){
        Scanner input = new Scanner(System.in);
        System.out.println("Comparando Idades ");

        System.out.println("Digite um Nome ");
        String nomeComparar = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idadeComparar = input.nextInt();

        input.nextLine();

        System.out.println("Digite um segundo nome: \n");
        String nomeComparar2 = input.nextLine();

        System.out.println("Digite sua idade: \n");
        int idadeComparar2 = input.nextInt();


        if(idadeComparar > idadeComparar2){
            int idadeDeDiferença = Math.abs(idadeComparar2 - idadeComparar) ;
              System.out.printf("%s é mais velho que %s\n", nomeComparar, nomeComparar2);
           System.out.printf("%s tem %s anos de diferença de %s\n",nomeComparar, idadeDeDiferença, nomeComparar2 );
        }
        if(idadeComparar2 > idadeComparar){
            int idadeDeDiferença =  Math.abs(idadeComparar - idadeComparar2 ) ;
             System.out.printf("%s é mais velho que %s\n",  nomeComparar2,nomeComparar);
            System.out.printf("%s tem %s anos de diferença de  %s\n",nomeComparar2, idadeDeDiferença, nomeComparar );
        }


    }



}
