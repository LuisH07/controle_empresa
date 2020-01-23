/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_empresa;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.sql.*;

/**
 * FXML Controller class
 *
 * @author luish
 */
public class AdcClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button b_voltar;
    private Button b_confirmar;
    private TextField t_nome;
    private TextField t_cnpj;
    private TextField t_bairro;
    private TextField t_estado;
    private TextField t_numero;
    private TextField t_celular;
    private TextField t_rua;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    Connection conection;
    public AdcClienteController(){
        conection = SqliteConnection.Connector();
        if(conection == null){
            System.exit(1); //Colocar um popup de erro
        }
    }
    
    public boolean isDbConnected(){
        try{
            return !conection.isClosed();
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
