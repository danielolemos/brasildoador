package br.com.brasilDoador.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqPessoaFisica",sequenceName="SEQ_PFISICA",allocationSize=1)
@Table(name="BDTB_PESSOA_FISICA")
public class PessoaFisica extends Pessoa{
	
	@ManyToOne
	@JoinColumn(name="CD_TIPO_DOADOR")
	private TipoDoador tipo;
	
	@ManyToOne
	@JoinColumn(name="CD_TIPO_SANGUINEO")
	private TipoSanguineo tipoSanguineo;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="DT_ULTIMA_DOACAO",nullable=false)
	private Calendar ultimaDoacao;
	
	@Column(name="DS_PESO",nullable=false,length=8)
	private double peso;
	
	@Enumerated(value=EnumType.STRING)
	@Column(name="DS_GENERO")
	private Sexo genero;
	
	
	@Column(name="DS_PONTUCAO",nullable=false,length=8)
	private int pontuacao;
	
	
	public TipoDoador getTipo() {
		return tipo;
	}
	public void setTipo(TipoDoador tipo) {
		this.tipo = tipo;
	}
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
	public Calendar getUltimaDoacao() {
		return ultimaDoacao;
	}
	public void setUltimaDoacao(Calendar ultimaDoacao) {
		this.ultimaDoacao = ultimaDoacao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Sexo getGenero() {
		return genero;
	}
	public void setGenero(Sexo genero) {
		this.genero = genero;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
	
	
	
}
