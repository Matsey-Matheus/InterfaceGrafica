package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    
    // FIM VARS PRIVATES

    // AREA DE REGISTRO
   
    @FXML
    void ClicouRegistrar(ActionEvent event) {
    	
    	// DECLARAÇÃO DE VARS
    	
    	usuario = txtUsuario.getText();
    	senha = txtSenha.getText();
    	
    	// FIM DEC DE VARS
    	
    	// CAMPO PREENCHIDO
    	
    	if (!usuario.equals("") && !senha.equals("")) {
    		
    		// SENHA MAIOR DO QUE 6 DIGITOS
    		
    		if (senha.length() >= 6) {
    		
    			// APARECER MENSAGENS E BOTÕES
    			
    			btnLogar.setVisible(true);
    			lblRegistro.setText("  Login");
    		
    			// RESETAR TEXTOS
    			
    			txtUsuario.setText("");
    			txtSenha.setText("");
    			
    			// SUMIR MENSAGENS E BOTÕES
    			
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
    	
    	// DECLARAÇÃO DE VARS
    	
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

}













