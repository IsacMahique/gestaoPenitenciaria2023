package main;

import controller.ProcessoController;
import view.FuncionariosEliminados;
import view.Menu;
import view.MenuFuncionario;
import view.ProcessosEliminados;
import view.RegistarProcesso;
import view.RelatorioGeral;
import view.TelaLogin;
import view.Visitas;

/**
 *
 * @author Kito Mahique
 */
public class Main {
    
    public static void main(String[] args){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });        
    }
    
}
