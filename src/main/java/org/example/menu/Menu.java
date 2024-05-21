package org.example.menu;

import org.example.models.Conversor;
import org.example.service.ConversorService;

import java.util.Scanner;

public class Menu {
    Scanner captura = new Scanner(System.in);

    public void menu() {
        boolean menuAtivo = true;

        while (menuAtivo) {
            System.out.println("""
                    Bem vindo ao Conversor de moedas.
                                        
                    Selecione uma opção abaixo
                                        
                    1 - BRL - USD
                    2 - BRL - EUR
                    3 - BRL - CNY
                    4 - USD - BRL
                    5 - EUR - BRL
                    6 - CNY - BRL
                    7 - Sair
                    """);

            System.out.println("Escolha uma opção:");
            String opcaoEscolhida = captura.next();


            switch (opcaoEscolhida) {
                case "1":
                    this.converter("BRL", "USD");
                    break;
                case "2":
                    this.converter("BRL", "EUR");
                    break;
                case "3":
                    this.converter("BRl", "CNY");
                    break;
                case "4":
                    this.converter("USD", "BRl");
                    break;
                case "5":
                    this.converter("EUR", "BRl");
                    break;
                case "6":
                    this.converter("CNY", "BRl");
                    break;

                default:
                    if (opcaoEscolhida.equals("7")) {
                        System.out.println("Obrigado por utilizar");
                        menuAtivo = false;
                    } else {
                        System.out.println("Opção invalida, digite a opção desejada ou 7 para sair");
                    }
                    break;
            }
        }

    }

    public void converter(String base_code, String target_code) {
        System.out.println("Informe um valor para converter: ");
        try {
            double valor = this.captura.nextDouble();
            Conversor conversor = new Conversor(base_code, target_code, valor);
            ConversorService conversorService = new ConversorService(conversor);
            System.out.println("Valor convertido " + target_code + " " + conversorService.ConverterValor());
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }
}
