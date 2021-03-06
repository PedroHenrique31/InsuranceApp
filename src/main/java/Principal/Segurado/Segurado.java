/**
 * @author Pedro Henrique Carneiro de Araújo
 * */
package Principal.Segurado;
import java.util.ArrayList;
import java.util.Locale;

import Principal.Apolice;

public class Segurado {//Classe 1
    private int ID_SEGURADO,tamanho=50;
    String Empresa, Nome, Grupo, Observacao1, Profissao, CPF, Indicacao;
    double Renda, RG;

    //Lista de telefones de contato
    protected ArrayList<Telefone> Telefones = new ArrayList<Telefone>(tamanho);
    //Lista de emails
    protected ArrayList<Email> emails = new ArrayList<Email>(tamanho);
    //Lista de endereços
    protected ArrayList<Endereco> Enderecos = new ArrayList<Endereco>(tamanho);
    //Lista de apólices
    protected ArrayList<Apolice> Apolices = new ArrayList<Apolice>(tamanho);
    //Lista de Dependentes
    protected ArrayList<Dependente> Dependentes = new ArrayList<Dependente>(tamanho);

    public void setID_SEGURADO(int ID_SEGURADO) {
        this.ID_SEGURADO = ID_SEGURADO;
    }

    public int getID_SEGURADO() {
        return ID_SEGURADO;
    }
    public Segurado(String empresa,String nome,String cpf,String profissao,String indicacao,
                    double renda,double rg){
        this.Empresa=empresa;
        this.Nome=nome.toUpperCase(Locale.ROOT);
        this.Profissao=profissao.toUpperCase(Locale.ROOT);
        this.Indicacao=indicacao.toUpperCase(Locale.ROOT);
        this.Renda=renda;
        this.RG=rg;
        this.CPF=cpf;// ver como validar cpf
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setObservacao1(String observacao1) {
        this.Observacao1 = observacao1;
    }

    public String getObservacao1() {
        return Observacao1;
    }

    public void setEmail(String email) {
        //TODO:verificar para saber se email já não existe e se o usuário quer adicionar uma nota sobre o email
        if(getEmails(email.toLowerCase(Locale.ROOT))==null){
            //Se getEmails retornar null é pq o email nao foi encontrado, logo ele deve ser adicionado.
            Email enderecoemail = new Email(email);
            emails.add(enderecoemail);
        }else {
            //TODO:faz nada pois nome é repetido.Lança excessão
        }
    }

    public Email getEmails(String buscado) {//não seria melhor listar tudo?
        //TODO:Procura pelo email e o retorna se não retorna null.
        boolean JaExiste;
        for (Email contaEmail:emails) {
            JaExiste=(contaEmail.email.equals(buscado.toLowerCase(Locale.ROOT)));
            if(JaExiste){
                return contaEmail;
            }
        }
        return null;
    }
    public ArrayList<Email> listaEmails(){
        return this.emails;
    }
}
