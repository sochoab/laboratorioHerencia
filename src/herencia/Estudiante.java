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
public class Estudiante {
    protected long carnet;
    protected int numMaterias;
    public Estudiante(){



}
    public Estudiante(long carnet,int numMaterias){
    this.carnet=carnet;
    this.numMaterias=numMaterias;
    }

    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }
    
    public void imprimirDatos(){
    String datos="";
    
    datos="su carnet es : "+carnet+ "\n"
            + "el numero de materias que ingreso fue : " +numMaterias;
        JOptionPane.showMessageDialog(null, datos);
    }
 public int leerDatoTipoEntero (String mensaje)
{
int valor = 0;
try
{
valor =
Integer.parseInt(JOptionPane.showInputDialog
(null,mensaje));
return (valor);
}
catch (Exception errorIngreso)
{
errorIngreso.printStackTrace();
return (0);
}
}
//Método para leer un double
public double leerDatoTipoReal (String mensaje)
{
double valor = 0.0;
valor =
Double.parseDouble
(JOptionPane.showInputDialog(null,mensaje));
return (valor);
}
//Método para leer un booleano
public boolean leerDatoTipoBooleano (String mensaje)
{
boolean valor = false;
valor =
Boolean.parseBoolean
(JOptionPane.showInputDialog(null,mensaje));
return (valor);
}
public String leerDatoTipoCadena (String mensaje)
{
String valor = "";
valor = JOptionPane.showInputDialog(null,mensaje);
return (valor);
}
}



