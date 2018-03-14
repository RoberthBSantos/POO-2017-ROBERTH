package models;

import java.util.List;

import javax.swing.JOptionPane;

public class Noticia {
	
	private String titulo, redacao, area, importancia;
	private Jornalista jornalista;
	private boolean aprovada;

	List<Noticia> noticia;
	private int indice;
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getImportancia() {
		return importancia;
	}
	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}
	public String getRedacao() {
		return redacao;
	}
	public void setRedacao(String redacao) {
		this.redacao = redacao;
	} 
	public Jornalista getJornalista() {
		return jornalista;
	}
	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	public void editarNoticia(Editor editor,Noticia noticia){
		if (editor.getArea() == this.area){
			System.out.println("Noticia revisada e autorizada!");
			noticia.setAprovada(true);
		}else{
			System.out.println("Editor não autorizado");
		}
	}
	
	public void publicar(Editor editor, Noticia noticia){
		if (editor.isChefe() == true && noticia.isAprovada() == true){
			System.out.println("pode publicar!");
			JOptionPane.showMessageDialog(null, noticia.getTitulo()+"\n"+noticia.getRedacao()+"\n");
			//System.out.println(noticia.getTitulo()+"\n"+noticia.getRedacao()+"\n");
		}
	}
	
	public void criarNoticia(Jornalista jornalista){
		Noticia noticia = new Noticia();
		titulo = JOptionPane.showInputDialog("Qual o titulo da notícia? ");
		redacao = JOptionPane.showInputDialog("Digite a redacao da noticia.");
		area = JOptionPane.showInputDialog("Digite a area da noticia.");
		
		if(titulo == "" || redacao == "" || area == ""){
			throw new CampoEmBrancoException();
		}else{
		
			noticia.setTitulo(titulo);
			noticia.setRedacao(redacao);
			noticia.setArea(area);
			noticia.setJornalista(jornalista);
			noticia.setAprovada(false);
			
			this.noticia.add(this.indice,noticia);
			indice++;
		}
	}
}
