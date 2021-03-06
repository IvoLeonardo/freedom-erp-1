package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Atclasatendo generated by hbm2java
 */
@Entity
@Table(name = "ATCLASATENDO")
public class Atclasatendo implements java.io.Serializable {

	private AtclasatendoId id;
	private Sgfilial sgfilial;
	private String descclasatendo;
	private char geracob;
	private char gerarel;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set atatendimentos = new HashSet(0);
	private Set atmodatendos = new HashSet(0);

	public Atclasatendo() {
	}

	public Atclasatendo(AtclasatendoId id, Sgfilial sgfilial,
			String descclasatendo, char geracob, char gerarel, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descclasatendo = descclasatendo;
		this.geracob = geracob;
		this.gerarel = gerarel;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atclasatendo(AtclasatendoId id, Sgfilial sgfilial,
			String descclasatendo, char geracob, char gerarel, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set atatendimentos, Set atmodatendos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descclasatendo = descclasatendo;
		this.geracob = geracob;
		this.gerarel = gerarel;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atatendimentos = atatendimentos;
		this.atmodatendos = atmodatendos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codclasatendo", column = @Column(name = "CODCLASATENDO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AtclasatendoId getId() {
		return this.id;
	}

	public void setId(AtclasatendoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCCLASATENDO", nullable = false, length = 50)
	public String getDescclasatendo() {
		return this.descclasatendo;
	}

	public void setDescclasatendo(String descclasatendo) {
		this.descclasatendo = descclasatendo;
	}

	@Column(name = "GERACOB", nullable = false, length = 1)
	public char getGeracob() {
		return this.geracob;
	}

	public void setGeracob(char geracob) {
		this.geracob = geracob;
	}

	@Column(name = "GERAREL", nullable = false, length = 1)
	public char getGerarel() {
		return this.gerarel;
	}

	public void setGerarel(char gerarel) {
		this.gerarel = gerarel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "atclasatendo")
	public Set getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atclasatendo")
	public Set getAtmodatendos() {
		return this.atmodatendos;
	}

	public void setAtmodatendos(Set atmodatendos) {
		this.atmodatendos = atmodatendos;
	}
*/
}
