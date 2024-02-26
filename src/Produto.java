public class Produto {
    private int codigo;
    private double precoUnitario;
    private String descricao;
    private static Produto listaProdutos [];

    public Produto(int codigo, double precoUnitario, String descricao){
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
    }
    public static Produto[]getListaProdutos(){
        listaProdutos = new Produto[15];

        listaProdutos[0] = new Produto(011, 1.5, "Caneta esferográfica BIC");
        listaProdutos[1] = new Produto(011,6.9, "Lapiseira Faber Castell");
        listaProdutos[2]= new Produto(011, 20.4, "Caderno UFC Tilibras");
        return listaProdutos;
    }
    public static Produto buscar(int codigo){
        return null;
    }
    public String getDescricao(){
        return descricao;
    }
}
