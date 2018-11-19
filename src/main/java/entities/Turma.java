package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Turma implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String siglaTurma;
	private String descricao;
	private String dataInicio;
	private String dataTermino;
	private String periodo;
	private int qtdeVagas;
	private String observacoes;
	
	private List<Matricula> matriculas = new ArrayList<>();
	
	private Instrutor instrutor;
	
	public Turma() {
		
	}
	
	public Turma(String siglaTurma, String descricao) {
		super();
		this.siglaTurma = siglaTurma;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSiglaTurma() {
		return siglaTurma;
	}

	public void setSiglaTurma(String siglaTurma) {
		this.siglaTurma = siglaTurma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getQtdeVagas() {
		return qtdeVagas;
	}

	public void setQtdeVagas(int qtdeVagas) {
		this.qtdeVagas = qtdeVagas;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}		
}