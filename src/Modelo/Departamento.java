/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author chelvivil
 */
public class Departamento {
    private String numeroDeRegistro;
    private String nombreDelDuño;
    private String cedula;
    private String placa;
    
    public Departamento() {
    }

    public Departamento(String numeroDeRegistro, String nombreDelDuño, String cedula, String placa) {
        this.numeroDeRegistro = numeroDeRegistro;
        this.nombreDelDuño = nombreDelDuño;
        this.cedula = cedula;
        this.placa = placa;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNombreDelDuño() {
        return nombreDelDuño;
    }

    public void setNombreDelDuño(String nombreDelDuño) {
        this.nombreDelDuño = nombreDelDuño;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

   
    
}
