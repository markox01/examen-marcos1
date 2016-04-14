/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author chelvivil
 */
public class MetodosDepartamento {
    
    private ArrayList<Departamento> arrayDepartamento;
    String arregloInformac1ionConsultada[]=new String[3];
    public MetodosDepartamento() {
        arrayDepartamento = new ArrayList<Departamento>();
    }
    public void agegarNumeroRegistro(String informacion[]){
        Departamento temp= new Departamento(informacion[0],informacion[1],informacion[2],informacion[3]);
        arrayDepartamento.add(temp);
    }
    public boolean buscarEstudiante(String informacion[]){
        boolean encontro=false;
        for(int contador=0;contador<arrayDepartamento.size();contador++){
            if(arrayDepartamento.get(contador).getNumeroDeRegistro().equals(informacion[0])){
               arregloInformac1ionConsultada[0]=arrayDepartamento.get(contador).getNombreDelDuño();
               arregloInformac1ionConsultada[1]=arrayDepartamento.get(contador).getCedula();
               arregloInformac1ionConsultada[2]=arrayDepartamento.get(contador).getPlaca();
               encontro=true;
            }
        }
        return encontro;
    }
    public String[] getArregloInformacion(){
        return this.arregloInformac1ionConsultada;
    }
    public void modificar(String informacion[]){
        for(int contador=0;contador<arrayDepartamento.size();contador++){
            if(arrayDepartamento.get(contador).getNumeroDeRegistro().equals(informacion[0])){
                arrayDepartamento.get(contador).setNombreDelDuño(informacion[1]);
                arrayDepartamento.get(contador).setCedula(informacion[2]);
                                        arrayDepartamento.get(contador).setPlaca(informacion[3]);

            }
        }
        
    }
    public void eliminar(String informacion[]){
        for(int contador=0;contador<arrayDepartamento.size();contador++){
            if(arrayDepartamento.get(contador).getNumeroDeRegistro().equals(informacion[0])){
                arrayDepartamento.remove(contador);
            }
        }
        
    }
        
    
    
}
