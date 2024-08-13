public class Calculo {
    int n1;
    int n2;

    public Calculo(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int Soma(int n1, int n2) {
        int soma = n1 + n2;
        
        return soma;
    }

    public int Subtracao(int n1, int n2) {
        int subtracao = n1 - n2;
        return subtracao;
    }

    public int Multiplicacao(int n1, int n2){
        int multiplicacao = n1 * n2;

        return multiplicacao;
    }

    public float Divisao(int n1, int n2){
        float divisao = n1/n2;

        return divisao;
    }

}
