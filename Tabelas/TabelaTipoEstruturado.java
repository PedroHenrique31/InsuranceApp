package Tabelas;

import java.util.ArrayList;

public class TabelaTipoEstruturado<T extends TipoEstruturado> {
    ArrayList<T> Tabela=new ArrayList<T>();
    T campoConstante;

    public void adicionaNovo(T novo){
        Tabela.add(novo);
    }
    public T busca(int i){
        T buscado=Tabela.get(i);
        return buscado;
    }
    public ArrayList<T> listaTodos(){
        return Tabela;
    }
    public void modifica(int posicao,String nome){
        T velho=Tabela.get(posicao),novo;
        int ID=velho.getIdentificador();
        novo=new T(nome,ID);
        Tabela.set(posicao,novo);

    }
    public void CriaNovo(String nome){
        T novo;
        int ultimaPosicao=Tabela.size()-1;
        novo=new T(nome,ultimaPosicao);
        Tabela.add(novo);

    }

}
