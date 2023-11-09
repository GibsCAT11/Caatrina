/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import mx.itson.catrina.enums.TipoMovimiento;


/**
 * Aqui se inicializan todas las variables del Array tipo Transactions
 * @author GibsCAT11
 */
public class Transactions implements Comparable<Transactions> {
    
    private Date date;
    private String description;
    private float amount;
    private TipoMovimiento type;
    private String fechaOperacion;
    private String descripcionOperacion;
    private float deposito;
    private float retiro;
    private float subtotal;

    public String getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    public void setDescripcionOperacion(String descripcionOperacion) {
        this.descripcionOperacion = descripcionOperacion;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getRetiro() {
        return retiro;
    }

    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public TipoMovimiento getType() {
        return type;
    }

    public void setType(TipoMovimiento type) {
        this.type = type;
    }

    @Override
    /**
     * Sirve para hacer las comparaciones necesarias para acomodar el ArrayList
     */
    public int compareTo(Transactions o) {
        
        DateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy");
         
        String a = formato3.format(this.getDate());
        String b = formato3.format(o.getDate());
        return a.compareTo(b);
        
    }
    
}
