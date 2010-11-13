package br.ueg.openodonto.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.ueg.openodonto.persistencia.orm.Column;
import br.ueg.openodonto.persistencia.orm.ForwardKey;
import br.ueg.openodonto.persistencia.orm.Inheritance;
import br.ueg.openodonto.persistencia.orm.Relationship;
import br.ueg.openodonto.persistencia.orm.Table;
import br.ueg.openodonto.util.WordFormatter;

@Table(name = "pacientes")
@Inheritance(joinFields = { @ForwardKey(tableField = "id_pessoa", foreginField = "id") })
public class Paciente extends Pessoa {

	private static final long serialVersionUID = -8543328508793753975L;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "data_inicio_tratamento")
	private Date dataInicioTratamento;

	@Column(name = "data_termino_tratamento")
	private Date dataTerminoTratamento;

	@Column(name = "data_retorno")
	private Date dataRetorno;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Column(name = "responsavel")
	private String responsavel;

	@Column(name = "referencia")
	private String referencia;

	@Column(name = "observacao")
	private String observacao;

	@Relationship
	private List<Odontograma> odontogramas;

	public Paciente() {
		this.odontogramas = new ArrayList<Odontograma>();
	}

	public Paciente(Long codigo) {
		this();
		setCodigo(codigo);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		cpf = WordFormatter.clear(cpf);
		this.cpf = cpf;
	}

	public Date getDataInicioTratamento() {
		return dataInicioTratamento;
	}

	public void setDataInicioTratamento(Date dataInicioTratamento) {
		this.dataInicioTratamento = dataInicioTratamento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Date getDataTerminoTratamento() {
		return dataTerminoTratamento;
	}

	public void setDataTerminoTratamento(Date dataTerminoTratamento) {
		this.dataTerminoTratamento = dataTerminoTratamento;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Odontograma> getOdontogramas() {
		return odontogramas;
	}

	public void setOdontogramas(List<Odontograma> odontogramas) {
		this.odontogramas = odontogramas;
	}	
	
	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", dataInicioTratamento="
				+ dataInicioTratamento + ", dataNascimento=" + dataNascimento
				+ ", dataRetorno=" + dataRetorno + ", dataTerminoTratamento="
				+ dataTerminoTratamento + ", observacao=" + observacao
				+ ", odontogramas=" + odontogramas + ", referencia="
				+ referencia + ", responsavel=" + responsavel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime
				* result
				+ ((dataInicioTratamento == null) ? 0 : dataInicioTratamento
						.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((dataRetorno == null) ? 0 : dataRetorno.hashCode());
		result = prime
				* result
				+ ((dataTerminoTratamento == null) ? 0 : dataTerminoTratamento
						.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result
				+ ((odontogramas == null) ? 0 : odontogramas.hashCode());
		result = prime * result
				+ ((referencia == null) ? 0 : referencia.hashCode());
		result = prime * result
				+ ((responsavel == null) ? 0 : responsavel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataInicioTratamento == null) {
			if (other.dataInicioTratamento != null)
				return false;
		} else if (!dataInicioTratamento.equals(other.dataInicioTratamento))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (dataRetorno == null) {
			if (other.dataRetorno != null)
				return false;
		} else if (!dataRetorno.equals(other.dataRetorno))
			return false;
		if (dataTerminoTratamento == null) {
			if (other.dataTerminoTratamento != null)
				return false;
		} else if (!dataTerminoTratamento.equals(other.dataTerminoTratamento))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (odontogramas == null) {
			if (other.odontogramas != null)
				return false;
		} else if (!odontogramas.equals(other.odontogramas))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		return true;
	}

}