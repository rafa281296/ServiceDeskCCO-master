package br.usjt.deswebmob.servicedesk.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Data {

    public static ArrayList<Chamado> buscarChamados(String chave) {
        ArrayList<Chamado> lista = gerarListaChamados();
        if (chave == null || chave.length() == 0) {
            return lista;
        }
        ArrayList<Chamado> resultado = new ArrayList<>();

        for(Chamado chamado:lista){
            if(chamado.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }


    public static ArrayList<Chamado> gerarListaChamados() {
        ArrayList<Chamado> lista = new ArrayList<>();

        Chamado chamado = new Chamado();
        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Computador da secretária quebrado");

        Fila fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado  = new Chamado();
        chamado.setNumero(2);
        chamado.setDataAbertura(new Date());
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona");

        fila  = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado  = new Chamado();
        chamado.setNumero(3);
        chamado.setDataAbertura(new Date());
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona");

        fila  = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado  = new Chamado();
        chamado.setNumero(4);
        chamado.setDataAbertura(new Date());
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona");

        fila  = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado  = new Chamado();
        chamado.setNumero(5);
        chamado.setDataAbertura(new Date());
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("ITIL V3");

        fila  = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);


       /* chamados.add("Desktops: Chamado1");
        chamados.add("Desktops: Computador da secretária quebrado.");
        chamados.add("Telefonia: Telefone não funciona.");
        chamados.add("Redes: Manutenção no proxy.");
        chamados.add("Servidores: Lentidão generalizada.");
        chamados.add("Novos Projetos: CRM");
        chamados.add("Manutenção Sistema ERP: atualizar versão.");
        chamados.add("Novos Projetos: Rede MPLS");
        chamados.add("Manutenção Sistema de Vendas: incluir pipeline.");
        chamados.add("Manutenção Sistema ERP: erro contábil");
        chamados.add("Novos Projetos: Gestão de Orçamento");
        chamados.add("Novos Projetos: Big Data");
        chamados.add("Manoel de Barros");
        chamados.add("Redes: Internet com lentidão");
        chamados.add("Novos Projetos: Chatbot");
        chamados.add("Desktops: troca de senha");
        chamados.add("Desktops: falha no Windows");
        chamados.add("Novos Projetos: ITIL V3");
        chamados.add("Telefonia: liberar celular");
        chamados.add("Telefonia: mover ramal");
        chamados.add("Redes: ponto com defeito");
        chamados.add("Novos Projetos: ferramenta EMM");
*/
        return lista;
    }


}
