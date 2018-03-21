/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaprogra3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "CUENTAS", catalog = "", schema = "BANCO")
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")
    , @NamedQuery(name = "Cuentas.findByNumerocuenta", query = "SELECT c FROM Cuentas c WHERE c.numerocuenta = :numerocuenta")
    , @NamedQuery(name = "Cuentas.findByCliente", query = "SELECT c FROM Cuentas c WHERE c.cliente = :cliente")
    , @NamedQuery(name = "Cuentas.findByTipocuenta", query = "SELECT c FROM Cuentas c WHERE c.tipocuenta = :tipocuenta")
    , @NamedQuery(name = "Cuentas.findByMovimiento", query = "SELECT c FROM Cuentas c WHERE c.movimiento = :movimiento")
    , @NamedQuery(name = "Cuentas.findByFecha", query = "SELECT c FROM Cuentas c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cuentas.findBySaldo", query = "SELECT c FROM Cuentas c WHERE c.saldo = :saldo")})
public class Cuentas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMEROCUENTA")
    private String numerocuenta;
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "TIPOCUENTA")
    private String tipocuenta;
    @Column(name = "MOVIMIENTO")
    private String movimiento;
    @Column(name = "FECHA")
    private String fecha;
    @Column(name = "SALDO")
    private Integer saldo;

    public Cuentas() {
    }

    public Cuentas(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        String oldNumerocuenta = this.numerocuenta;
        this.numerocuenta = numerocuenta;
        changeSupport.firePropertyChange("numerocuenta", oldNumerocuenta, numerocuenta);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        String oldTipocuenta = this.tipocuenta;
        this.tipocuenta = tipocuenta;
        changeSupport.firePropertyChange("tipocuenta", oldTipocuenta, tipocuenta);
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        String oldMovimiento = this.movimiento;
        this.movimiento = movimiento;
        changeSupport.firePropertyChange("movimiento", oldMovimiento, movimiento);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        Integer oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerocuenta != null ? numerocuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.numerocuenta == null && other.numerocuenta != null) || (this.numerocuenta != null && !this.numerocuenta.equals(other.numerocuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebaprogra3.Cuentas[ numerocuenta=" + numerocuenta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
