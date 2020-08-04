package projetocalculadorainss;

import java.util.Scanner;

public class ProjetoCalculadoraInss {

    public static void main(String[] args) {
        float aliquota1 = 1045.00f;
        float aliquota2 = 2089.60f;
        float aliquota3 = 3134.40f;
        float aliquota4 = 6101.06f;
        float calculo = 0;
        float percent1 = 78.37f;
        float percent2 = 94.01f;
        float percent3 = 125.37f;
        float percent4 = 415.33f;
        float percent5 = 713.08f;
        int aux2 = 0;

        Scanner ler = new Scanner(System.in);
        funcionario func = new funcionario();

        do {
            try {
                System.out.println("\nDigite \n1 - Iniciar Cálculo\n2 - Finalizar");
                aux2 = ler.nextInt();
            } catch (Exception erro) {
                System.out.println("Dado informado é incorreto, erro informado: " + erro);
                aux2 = 2;
            }    
                switch (aux2) {
                    case 1:
                        System.out.println("Informe o nome do funcionário: ");
                        ler.nextLine();
                        func.setNome(ler.nextLine());
                        System.out.println("Informe o valor do salário bruto: ");
                        func.setSalario(ler.nextFloat());

                        if (func.getSalario() >= aliquota4) {
                            calculo = percent5;
                            System.out.println("Funcionário: " + func.getNome());
                            System.out.printf("Inss: %.2f\n", calculo);

                        } else if (func.getSalario() >= aliquota3) {
                            calculo = ((func.getSalario() - aliquota3) * 0.14f);
                            calculo = calculo + percent1 + percent2 + percent3;
                            System.out.println("Funcionário: " + func.getNome());
                            System.out.printf("Inss: %.2f\n", calculo);

                        } else if (func.getSalario() >= aliquota2) {
                            calculo = ((func.getSalario() - aliquota2) * 0.12f);
                            calculo = calculo + percent1 + percent2;
                            System.out.println("Funcionário: " + func.getNome());
                            System.out.printf("Inss: %.2f\n", calculo);

                        } else if (func.getSalario() >= aliquota1) {
                            calculo = ((func.getSalario() - aliquota1) * 0.09f);
                            System.out.println(calculo);
                            calculo = calculo + percent1;
                            System.out.println("Funcionário: " + func.getNome());
                            System.out.printf("Inss: %.2f\n", calculo);

                        } else {
                            calculo = func.getSalario() * 0.075f;
                            System.out.println("Funcionário: " + func.getNome());
                            System.out.printf("Inss: %.2f\n", calculo);
                        }
                        break;
                    case 2:

                        System.out.println("Finalizado!");
                        break;
                    default:
                        if (aux2 < 1 || aux2 > 2) {
                            System.out.println("\nInformação Digitada incorreta!");
                        }
                }
            }while (aux2 == 1 || aux2 > 2 || aux2 < 1);

        } 

    }


