/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMain;
import models.ModelMain;
import views.ViewMessage;
import views.ViewOperaciones;
import views.ViewMayor;
import views.ViewEditorTexto;

public class ControllerMain implements ActionListener{
    ViewMain viewMain;
    ViewMessage viewMessage;
    ModelMain modelMain;
    ViewOperaciones view_operaciones;
    ViewMayor view_mayor;
    ViewEditorTexto view_editortexto;
    
    public ControllerMain(ViewMain viewMain,ViewMessage viewMessage,ModelMain modelMain, ViewOperaciones view_operaciones, ViewMayor view_mayor,  ViewEditorTexto view_editortexto){
        this.view_operaciones = view_operaciones;
        this.viewMain = viewMain;
        this.viewMessage = viewMessage;
        this.modelMain = modelMain;
        this.view_mayor = view_mayor;
        this.view_editortexto = view_editortexto;
        this.viewMain.jmiMessage.addActionListener(this);
        this.viewMain.jmiOperaciones.addActionListener(this);
        this.viewMain.jmi_mayorde3numeros.addActionListener(this);
        this.viewMain.jmi_editortexto.addActionListener(this);
        
        
       
        initView();
        
    }

       @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMain.jmiMessage)
            jmiMessageActionPerformed();
        if(e.getSource()==viewMain.jmiOperaciones)
            jmiOperacionesActionPerformed();
        if(e.getSource()==viewMain.jmi_mayorde3numeros)
            jmi_mayorde3numerosActionPerformed();
        if(e.getSource()==viewMain.jmi_editortexto)
            jmi_editortextoActionPerformed();
    }
    
    public void jmiMessageActionPerformed(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
     public void jmiOperacionesActionPerformed(){
        this.viewMain.setContentPane(view_operaciones);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
     public void jmi_mayorde3numerosActionPerformed(){
        this.viewMain.setContentPane(view_mayor);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
     public void jmi_editortextoActionPerformed(){
        this.viewMain.setContentPane(view_editortexto);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    private void initView(){
        this.viewMain.setTitle("Hello MVC Panel");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
     
}
