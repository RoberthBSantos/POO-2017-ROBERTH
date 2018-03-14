package interfaces;

public interface Login {
	String email = null;
	String senha = null;

	public default boolean logar(String email, String senha){
		if(this.email == email && this.senha == senha){
			return true;
		}else{
			return false;
		}
	}

}
