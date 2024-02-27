package estrut;

public interface Tree extends EstruturaElementar{
    int valor = 0;
    Tree esquerda = null;
    Tree direita = null;
    public int[] preOrdem();
    public int[] emOrdem();
    public int[] posOrdem();
}
