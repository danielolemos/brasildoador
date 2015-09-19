package br.com.brasilDoador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seqTipo",sequenceName="SEQ_TIPO",allocationSize=1)
@Table(name="BDTB_TIPO_SANGUINEO")
public class TipoSanguineo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTipo")
	@Column(name="cd_tipo")
	private int id;
	
	@Column(name="DS_tipo")
	private String descricao;
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
