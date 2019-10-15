/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto19cloneestudante;

import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Estudante {
    //ATRIBUTOS
    private String nome;
    private String RA;
    private String celular;
    
    //ARRAYLISTs
    ArrayList<String> listaDisciplinas = new ArrayList<>();
    ArrayList<Integer> listaNotas = new ArrayList<>();
     ArrayList<Estudante> Monitor = new ArrayList<>();

    public Estudante() {
    }

    public Estudante(String nome, String RA, String celular) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<String> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<String> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public ArrayList<Estudante> getMonitor() {
        return Monitor;
    }

    public void setMonitor(ArrayList<Estudante> Monitor) {
        this.Monitor = Monitor;
    }
    
    
    
    //MÉTODOS
    public void addDisciplinasNotas(String disciplina, int nota){
            listaDisciplinas.add(disciplina);
            listaNotas.add(nota);
    }
    
    public void listarNotasDisciplinas(){
        for(int i = 0; i < listaDisciplinas.size(); i++){
            System.out.println("Disciplina: " + listaDisciplinas.get(i) + 
                               " Nota: " + listaNotas.get(i) + "\n");
        }
    }
    
    public int calcularMediaNotas(){
        int media = 0;
        for(int i = 0; i < listaNotas.size(); i++){
            media += listaNotas.get(i);
        }
        media = media / listaNotas.size();
        return media;
    }
    
    public void addEstudante(Estudante objEstudante){
    Monitor.add(objEstudante);
    }
    
     public void ListarMonitorEstudante(){
         for(int i = 0; i < Monitor.size(); i++){
            System.out.println("\nMonitorado: " + Monitor.get(i).nome + "\nRA: " + Monitor.get(i).RA +
                               "\nCelular: " + Monitor.get(i).celular);
        }
    
    }
}
