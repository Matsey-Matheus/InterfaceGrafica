package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Acoes {
	
	// VARS GLOBAIS
	
	static String usuario;
	static String usuarioLogin;
	static String senha;
	static String senhaLogin;
	
	// FIM VARS GLOBAIS
	
	// TIPOS VARS PRIVATES
	
	@FXML
    private Label lblRegistro;
	@FXML
    private Label lblPreencha;
	@FXML
    private Label lblSenhaCurta;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Button btnRegistrar;
    @FXML
    private Button btnLogar;
    @FXML
    private DatePicker Data;
    @FXML
    private Hyperlink Link;
    
    // FIM VARS PRIVATES
    
    // AREA DE REGISTRO
   
    @FXML
    void ClicouRegistrar(ActionEvent event) {
    	
    	// DECLARA��O DE VARS  	
    	usuario = txtUsuario.getText();
    	senha = txtSenha.getText();
    	
    	// FIM DEC DE VARS
    	
    	// CAMPO PREENCHIDO
    	
    	if (!usuario.equals("") && !senha.equals("")) {
    		
    		// SENHA MAIOR DO QUE 6 DIGITOS
    		
    		if (senha.length() >= 6) {
    		
    			// APARECER MENSAGENS E BOT�ES
    			
    			btnLogar.setVisible(true);
    			lblRegistro.setText("  Login");
    		
    			// RESETAR TEXTOS
    			
    			txtUsuario.clear();
    			txtSenha.clear();
    			
    			// SUMIR MENSAGENS E BOT�ES
    			
    			lblPreencha.setVisible(false);
    			lblSenhaCurta.setVisible(false);
    			btnRegistrar.setVisible(false);
    			btnRegistrar.setDisable(true);
    			
    		
    		} else {
    			
    			// CAMPO VAZIO
	    		
	    		lblPreencha.setVisible(false);
	    		
	    		lblSenhaCurta.setVisible(true);
    			
    		}
    		
    	} else {
    		
    		// SENHA MENOR DO QUE 6 DIGITOS
    		
    		lblSenhaCurta.setVisible(false);
    		
    		lblPreencha.setVisible(true);
    		

    	}
    	
    }
    
    // AREA DE LOGIN
    
    @FXML
    void ClicouLogar(ActionEvent event) {
    	
    	// DECLARA��O DE VARS
    	
    	usuarioLogin = txtUsuario.getText();
    	senhaLogin = txtSenha.getText(); 
    	
    	if (usuarioLogin.equals(usuario) && senhaLogin.equals(senha)) {
    		
    		// LOGADO
    		
    		lblRegistro.setText("Logado");
    		txtUsuario.setVisible(false);
    		txtSenha.setVisible(false);
    		btnLogar.setVisible(false);
    		lblPreencha.setVisible(false);
    		lblSenhaCurta.setVisible(false);
    		
    	} else {
    		
    		// USER OU SENHA INCORRETOS.
    		
    		lblPreencha.setVisible(true);
    		lblPreencha.setLayoutX(170);
    		lblPreencha.setText("Usuario ou senha incoretos.");
    		
    	}

    }
    
    @FXML
    void ApertouEnter(KeyEvent event) {
    	
    	KeyCode tecla = event.getCode();
    	
    	if (tecla == event.getCode().ENTER) {
    		
    		txtSenha.requestFocus();
    		
    		
    		
    //		if () {
    		
    //			System.out.println("eae");
    		
    //		}
    			
    	}

    }

    @FXML
    void LinkClique(ActionEvent event) throws URISyntaxException, IOException {

    	Desktop.getDesktop().browse(new URI("https://www.instagram.com/im.theusz/"));
    	
    }
    
}















