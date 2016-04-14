/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosDepartamento;
import Vista.FRM_Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chelvivil
 */
public class Controlador_FRM_Ventana implements ActionListener {
MetodosDepartamento metodos;
FRM_Ventana ventana;
    public Controlador_FRM_Ventana(FRM_Ventana controlador) {
        
        
        metodos = new MetodosDepartamento();
        ventana=controlador;
    }
        public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
           this.Buscar();
        }
        
        
        if(e.getActionCommand().equals("Agregar"))
        {
           metodos.agegarNumeroRegistro(ventana.devolverInformacion());
        ventana.limpiar();
        ventana.estadoInicial();

        }
        if(e.getActionCommand().equals("Modificar"))
        {
           metodos.modificar(ventana.devolverInformacion());
            ventana.limpiar();
        ventana.estadoInicial();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
           metodos.eliminar(ventana.devolverInformacion());
            ventana.limpiar();
        ventana.estadoInicial();
        }
    }
    
public void Buscar(){
    if(metodos.buscarEstudiante(ventana.devolverInformacion())){
        ventana.mostrarInformacion(metodos.getArregloInformacion());
        ventana.deshabilitarNumeroDeRegistro();
ventana.habilitarOpciones();

    }
    else {
        System.out.println("el estudiante no se encuentra");
        ventana.habilitarAgregar();
        ventana.deshabilitarNumeroDeRegistro();
        
    }
}
    

}
