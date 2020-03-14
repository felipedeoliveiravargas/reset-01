package exercicio3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Produto {
    public Produto(String nome, Segmento segmento, double valor, double quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    String nome;
    Segmento segmento;
    double valor;
    double quantidade;

    public void imprimir(){
        double valorTotal = quantidade * valor;
        System.out.println("[ " + segmento + " ]" + nome + " ( "+ quantidade + " ) - " + valor + "|" + valorTotal );
    }

}
