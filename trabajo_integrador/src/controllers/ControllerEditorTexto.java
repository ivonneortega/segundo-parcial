/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.FileWriter;
import models.ModelEditorTexto;
import views.ViewEditorTexto;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author PC14
 */
public class ControllerEditorTexto {

    private FileWriter fw;
    ModelEditorTexto model_editortexto;
    ViewEditorTexto view_editortexto;

    private FileReader fr = null;
    private JFileChooser jfc = new JFileChooser();
    
    public ControllerEditorTexto(ModelEditorTexto model_editortexto, ViewEditorTexto view_editortexto) throws IOException{
        this.model_editortexto = model_editortexto;
        this.view_editortexto = view_editortexto;
        initViews();
        view_editortexto.jmi_abrir.addActionListener(e-> abrir_click());
        view_editortexto.jmi_guardar.addActionListener(e-> guardar_click());
        view_editortexto.jmi_salir.addActionListener(e-> salir_click());
        
        
    }

    private void jmi_abrir() throws IOException {
        try {
            jfc.showOpenDialog(view_editortexto);
            model_editortexto.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_editortexto.getArchivo());
            int character = 0;
            String texto = " ";
            while ((character = fr.read()) != -1) {
                texto += (char) character;

            }
           
            fr.close();
            view_editortexto.jta_archivo.setText(texto);
        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.err.println("Error en el archivo");
        } finally {
            try {
                fr.close();

            } catch (IOException err) {
                System.err.println("Eror al cerrar");
            }
        }
    }
    private void jmi_guardar() throws IOException {
        try {
             fw = new FileWriter(model_editortexto.getArchivo(), false);
             fw.write(view_editortexto.jta_archivo.getText());
             System.out.println("Se ha guardado correctamente");
             fw.close();

          
           
        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.err.println("Error en el archivo");
        } finally {
            try {
                fr.close();

            } catch (IOException err) {
                System.err.println("Eror al cerrar");
            }
        }
    }
    
    public void initViews(){
        this.view_editortexto.setLocationRelativeTo(null);
        view_editortexto.setVisible(true);
    }
    
    
    private void abrir_click(){
        try {
            this.jmi_abrir();
        } catch (IOException ex) {
            Logger.getLogger(ControllerEditorTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void guardar_click(){
        try {
            this.jmi_guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControllerEditorTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
    
    private void salir_click(){
        System.exit(0);
    }
}
