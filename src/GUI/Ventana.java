/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;




import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import productos_concretos.Binario;
/**
 *
 * @author User
 */
public class Ventana extends JFrame{
    
     private JTextField resultado,numeroA;
    private JButton botonsum,botonres,botonmult,botondiv,botonbinario;
    Binario binario = new Binario();
    public Ventana(){
        super("    CALCULADORA    ");
        initComponent();
    }
    
    public void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        resultado=new JTextField();
        resultado.setBounds(80,170,200,60);
        
        numeroA=new JTextField();
        numeroA.setBounds(95,10,170,60);
        
        botonsum= new JButton("+");
        botonsum.setBounds(10,90,60,60);
        
        botonres= new JButton("-");
        botonres.setBounds(80,90,60,60);
        
        botonmult= new JButton("x");
        botonmult.setBounds(150,90,60,60);
        
        botondiv= new JButton("÷");
        botondiv.setBounds(220,90,60,60);
        
        botonbinario= new JButton("BIN");
        botonbinario.setBounds(290,90,60,60);
        
       botonbinario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int n;
                String valor = binario.resultado();
                n = Integer.parseInt(numeroA.getText());
                binario.OperarC(n);
                resultado.setText(valor);
            }
        });
        
        Container contenedor = getContentPane();
        contenedor.add(resultado);
        contenedor.add(numeroA);
        contenedor.add(botonsum);
        contenedor.add(botonres);
        contenedor.add(botonmult);
        contenedor.add(botondiv);
        contenedor.add(botonbinario);
        //boton1.addActionListener(new ActionListener(){
          // @Override
          // public void actionPerformed(ActionEvent e) {
            //   JOptionPane.
            //}
        //});
     setSize(400,280); 
    }
    
    public static void main(String[] args){
   java.awt.EventQueue.invokeLater(new Runnable() {
       @Override
       public void run() {
           new Ventana().setVisible(true);
       }
 
});
}
}
