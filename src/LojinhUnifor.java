import java.util.Scanner;

public class LojinhUnifor {
    public static void main(String[] args) {
        int codigo, quantidade;
        Produto produto;
        Venda venda;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do produto. ");
        codigo = input.nextInt();

        boolean repete = false;
        do{
            venda = new Venda();
            produto = Produto.buscar(codigo);
            if(produto==null){
                System.out.println("Código digitado incorretamente");
            }else {
                System.out.printf("Encontrado o produto %s. \n", produto.getDescricao());

                System.out.println("Informe quantos itens você vai levar.");
                quantidade=input.nextInt();

                venda.setProduto(quantidade,produto);

                System.out.println("Deseja inserir outro produto? ");
                System.out.println("1 - Sim, 2 - Não");
                codigo = input.nextInt();

                if(codigo==1){
                    repete =true;
                }else{
                    System.out.println("Imprindo o resumo da compra.");
                }

            }
        } while(repete);
    }
}
