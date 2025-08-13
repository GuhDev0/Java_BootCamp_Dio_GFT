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
    public void exercicioTabuada(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tabuada");
        int numberUser = input.nextInt();
        for(int i = 1; i <= 10; i++){
            int numberMultiplicado = numberUser * i;
            System.out.printf("%s * %s = %s \n",numberUser, i ,numberMultiplicado);
        }
    }
    public void exercicioCalculoDeImc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Calculo de Imc");
        System.out.println("Qual é o seu peso ? ");
        float peso = input.nextFloat();
        System.out.println("Qual é a sua Altura? ");
        float altura = input.nextFloat();
        float IMC = peso / (altura * altura);
        System.out.printf("SEU É IMC É : %.2f", IMC);
        if (IMC >= 18.5 && IMC <= 25){
            System.out.println("Peso ideial");
        }else if (IMC >= 25 && IMC <= 30){
            System.out.println("Levemente acima do peso");
        }else if (IMC >= 30 && IMC <= 35){
            System.out.println("Obesido acima do peso");
        }else if (IMC >= 35 && IMC <= 40){
            System.out.println("Obesidade GRAU ||");
        }else if (IMC >= 40 && IMC <= 45){
            System.out.println("Obesidade GRAU |||");
        }else{
            System.out.println("Passou dos limites");
        }


    }
    public void exercicioRetornaParesEImpares(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um Numero ? ");
        int numero = input.nextInt();
        System.out.println("Digite outro Numero ? ");
        int numero2 = input.nextInt();

        for(int i = numero; numero2 >= i; i++){

            if(i % 2 == 0){
                System.out.printf( " Pares "+ i +  "  " );
            }

            if(i % 2 == 1){
                System.out.printf("Impares " + i + " \n");
            }
        }



    }
    public void exercicioDividirAteChegarAZero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um Numero ? ");
        int numeroInicial = input.nextInt();
        System.out.println("Digite outro Numero ? ");
        int numero2 = input.nextInt();
        int numeroAtual =   numero2 % numeroInicial;

        while(numeroAtual == 0){
                 if( numero2 < numeroInicial){
                     continue;
                 }
                System.out.printf(numeroAtual + "\n Digite outro numero: \n");
                numero2 = input.nextInt();
                numeroAtual =   numero2 % numeroInicial;


        }
        System.out.printf(numeroAtual + " Loop Finalizado");
    }

}
