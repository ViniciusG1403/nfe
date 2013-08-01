package com.fincatto.nfe.v200.classes.lote.envio.recibo;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fincatto.nfe.NFAmbiente;
import com.fincatto.nfe.NFUnidadeFederativa;
import com.fincatto.nfe.v200.classes.NFe;

@Root(name = "retEnviNFe")
public class TRetEnviNFe extends NFe {
	
	@Attribute(name = "versao", required = true)
	private String versao;
	
	@Element(name = "tpAmb", required = true)
	private NFAmbiente ambiente;
	
	@Element(name = "verAplic", required = true)
	private String versaoAplicacao;
	
	@Element(name = "cStat", required = true)
	private String status;
	
	@Element(name = "xMotivo", required = true)
	private String motivo;
	
	@Element(name = "cUF", required = true)
	private NFUnidadeFederativa uf;
	
	@Element(name = "dhRecbto", required = true)
	private Date dataRecebimento;
	
	@Element(name = "infRec", required = true)
	private TRetEnviNFeInfRec infoRecebimento;
	
	public TRetEnviNFe() {
	}
	
	public String getVersao() {
		return this.versao;
	}
	
	public void setVersao(final String versao) {
		this.versao = versao;
	}
	
	public NFAmbiente getAmbiente() {
		return this.ambiente;
	}
	
	public void setAmbiente(final NFAmbiente ambiente) {
		this.ambiente = ambiente;
	}
	
	public String getVersaoAplicacao() {
		return this.versaoAplicacao;
	}
	
	public void setVersaoAplicacao(final String versaoAplicacao) {
		this.versaoAplicacao = versaoAplicacao;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(final String status) {
		this.status = status;
	}
	
	public String getMotivo() {
		return this.motivo;
	}
	
	public void setMotivo(final String motivo) {
		this.motivo = motivo;
	}
	
	public NFUnidadeFederativa getUf() {
		return this.uf;
	}
	
	public void setUf(final NFUnidadeFederativa uf) {
		this.uf = uf;
	}
	
	public Date getDataRecebimento() {
		return this.dataRecebimento;
	}
	
	public void setDataRecebimento(final Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	
	public TRetEnviNFeInfRec getInfoRecebimento() {
		return this.infoRecebimento;
	}
	
	public void setInfoRecebimento(final TRetEnviNFeInfRec infoRecebimento) {
		this.infoRecebimento = infoRecebimento;
	}
}