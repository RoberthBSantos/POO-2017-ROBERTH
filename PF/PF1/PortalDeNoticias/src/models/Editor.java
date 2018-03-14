package models;

import interfaces.Login;

public class Editor extends Jornalista implements Login{

	private boolean chefe;
	private String area;
	
	public Editor(String nome, String email, String senha, boolean chefe) {
		super(nome, email, senha);
		// TODO Auto-generated constructor stub
		
	}

	public boolean isChefe() {
		return chefe;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
