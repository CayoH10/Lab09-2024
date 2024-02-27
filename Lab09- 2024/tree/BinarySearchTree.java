package tree;

import estrut.Tree;

public class BinarySearchTree implements Tree{

    private Tree raiz;

    @Override
    public boolean buscaElemento(int valor) {
       
        if (valor == Tree.valor) {
            return false;

        }
        else if (valor < Tree.valor) {
            return buscaElemento(valor);
        }
         return true;
    }

    @Override
    public int minimo() {
        return encontraMinimo(raiz);
    }

    private int encontraMinimo(Tree raizAtual) {
       if(raizAtual == null) {
        throw new IllegalStateException("A arvore esta vazia");
       }
       while (raizAtual.esquerda != null) {
        raizAtual = Tree.esquerda;
    }

    return raizAtual.valor;

    }

    @Override
    public int maximo() {
        return encontraMaximo(raiz);
    }

    private int encontraMaximo(Tree raizAtual) {
       if (raizAtual == null) {
        throw new IllegalStateException("A árvore está vazia");
       }
       while (raizAtual.direita != null) {
        raizAtual = raizAtual.direita;
    }

    return raizAtual.valor;
    }

    @Override
    public void insereElemento(int valor) {
        raiz = inserirValor(raiz, valor);
    }

    private Tree inserirValor(Tree raizAtual, int valor) {
    if (raizAtual == null) {
        return raiz; 
            
       }
   
    return raizAtual;
    }

    @Override
    public void remove(int valor) {
        raiz = removeValor(raiz, valor);
    }

    private Tree removeValor(Tree raizAtual, int valor) {
        if (raizAtual == null) {
            return null;
        }

        if (valor < raizAtual.valor) {
            raizAtual.esquerda = removeValor(raizAtual.esquerda, valor);
        } else if (valor > raizAtual.valor) {
            raizAtual.direita = removeValor(raizAtual.direita, valor);
        } else {
            if (raizAtual.esquerda == null) {
                return raizAtual.direita;
            } else if (raizAtual.direita == null) {
                return raizAtual.esquerda;
            }

            raizAtual.valor = removeValor(raizAtual.direita);
            raizAtual.direita = removeValor(raizAtual.direita, raizAtual.valor);
        }

        return raizAtual;
    

    }

    private int remove(Tree direita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int[] preOrdem() {
        return new int[]{1,2};
    }

    @Override
    public int[] emOrdem() {
        return new int[]{1,2};
    }

    @Override
    public int[] posOrdem() {
        return new int[]{1,2};
    }

    

}