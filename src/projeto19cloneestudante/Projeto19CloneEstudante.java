/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto19cloneestudante;

/**
 *
 * @author jonat
 */
public class Projeto19CloneEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Estudante objEstudante01 = new Estudante("jonathan", "777999", "14-99999-55555");
       Estudante objEstudante02 = new Estudante("Igor", "888666", "14-99999-99999");
       Estudante objEstudante03 =  new  Estudante ( " Joao " , " 94321 " , " 14-96999-7777 " );
       Estudante objEstudante04 =  new  Estudante ( " mateus " , " 84321 " , " 14-97999-7777 " );
       Estudante objEstudante05 =  new  Estudante ( " pedro " , " 74321 " , " 14-98999-7777 " );
       
       objEstudante01 . addDisciplinasNotas ( " POO " , 6 );
       objEstudante01 . addDisciplinasNotas ( " ENG. SOFT. " , 6 );
       objEstudante01 . addDisciplinasNotas ( " SO " , 6 );
       objEstudante01 . addDisciplinasNotas ( " ESTRUTURA " , 6 );
       objEstudante01 . addDisciplinasNotas ( " ESTATÍSTICA " , 6 );
       
       objEstudante02 . addDisciplinasNotas ( " POO " , 7 );
       objEstudante02 . addDisciplinasNotas ( " ENG. SOFT. " , 7 );
       objEstudante02 . addDisciplinasNotas ( " SO " , 7 );
       objEstudante02 . addDisciplinasNotas ( " ESTRUTURA " , 7 );
       objEstudante02 . addDisciplinasNotas ( " ESTATÍSTICA " , 7 );
       
       objEstudante01 . listarNotasDisciplinas ();
       objEstudante02 . listarNotasDisciplinas ();
       
       System.out.println( " Média Notas "  + objEstudante01 . getNome () +  " : "  + objEstudante01 . calcularMediaNotas ());
       System.out.println( " Média Notas "  + objEstudante02 . getNome () +  " : "  + objEstudante02 . calcularMediaNotas ());
       
       objEstudante01 . addEstudante (objEstudante02);
       objEstudante01 . addEstudante (objEstudante03);
       objEstudante01 . addEstudante (objEstudante04);
       objEstudante01 . addEstudante (objEstudante05);
       
       objEstudante01.ListarMonitorEstudante();
       
    }
    
    }
    

