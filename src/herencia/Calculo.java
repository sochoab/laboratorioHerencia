/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Calculo extends Estudiante {
    protected double promedio;
    
    public Calculo(){
    
    
    }

    public Calculo(double promedio, long carnet, int numMaterias) {
        super(carnet, numMaterias);
        this.promedio = promedio;
        
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void imprimirAsignacionSalario (double prim)
{
JOptionPane.showMessageDialog(null,"El estudiante saco un promedio de: "+prim);
}

    public double calculoP(int numNotas,double[]notas){
    int acum=0;
    int promedio;
    for(int i=0;i<numNotas;i++){
    acum=(int) (acum+notas[i]);
    
    }
    promedio= acum/numNotas;
        
    return(promedio);
    }
    
    public Calculo ingresarDatos(){
    Calculo ob1= new Calculo();
    
    int numeroM;
    long car;
    double promedio;
    car= Long.parseLong(JOptionPane.showInputDialog("Ingrese su carnet: "));
    numeroM= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de materias: "));
    double[] not= new double[numeroM];
    for(int i=0;i<numeroM;i++){
    not[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota: "));
    
    }
    promedio= calculoP(numeroM,not);
    
    ob1.setCarnet(car);
    ob1.setNumMaterias(numeroM);
    ob1.setPromedio(promedio);
    return(ob1);
    }
    public void imprimirReporte(){
    imprimirDatos();
    imprimirAsignacionSalario (promedio);
    
    
    }
    
    
}
