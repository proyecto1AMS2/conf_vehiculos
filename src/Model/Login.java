package Model;

public class Login {

	private void comprovarLogin() {
		//login.getText();
		String tField="carlos",pField;
		boolean esCorrectoLogin=false;
		boolean esCorrectoPassword=false;
		for(int a=0;a<usuario.length;a++) {
			if(tField/*.getText()*/.equals(usuario[a])) {
				esCorrectoLogin=true;
			}
		}
		for(int a=0;a<Password.length;a++) {
			if(pField.getText().equals(Password[a])) {
				esCorrectoPassword=true;
			}
		}
		if(!esCorrectoLogin) {
			JOptionPane.showMessageDialog(panel, "El Usuairo es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
		}else if(!esCorrectoPassword){
			JOptionPane.showMessageDialog(panel, "La contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
		}else if(!esCorrectoLogin && !esCorrectoPassword) {
			JOptionPane.showMessageDialog(panel, "El Usuario y la contraseña son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
