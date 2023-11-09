/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.business;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.itson.catrina.entities.Transactions;

/**
 *
 * @author GibsCAT11
 */
public class Operacion {
    
    float totalEnero = 0;
    float totalFebrero = 0;
    float totalMarzo = 0;
    float totalAbril = 0;
    float totalMayo = 0;
    float totalJunio = 0;
    float totalJulio = 0;
    float totalAgosto = 0;
    float totalSeptiembre = 0;
    float totalOctubre = 0;
    float totalNoviembre = 0;
    
    /**
     *  Aqui se hace todos los calculos y acomodos para su posterior impresion, no devuelve nada, ya que todo se guarda en un ArrayList en la entidad Cuenta
     * @param mes Se recibe el mes con el que se van a hacer calculos
     * @param transactions se recibe el ArrayList para los calculos
     * @return Retorna el ArrayList de los movimientos para despues mostrarlos
     */
    public List<Transactions> obtenerMovimientos (String mes, List<Transactions> transactions/*, List<Transactions> auxiliar03*/){
        
        DateFormat formato = new SimpleDateFormat("MM");
        DateFormat formato2 = new SimpleDateFormat("dd/MM/yy");
        
        List<Transactions> movimientosMes = new ArrayList<>();
        
        //List<Movimiento> movimientosMes = null;
        //Movimiento movimientos1 = new Transactions();
       // Transactions movimientos2 = new Transactions();
        //Movimiento movimientos3 = new Transactions();
        //List<Ingrediente> ingredientes = new ArrayList<>();
        //List<Movimiento> auxiliar = new ArrayList<>();
       // List<Movimiento> auxiliar1 = new ArrayList<>();
       // List<Movimiento> auxiliar2 = new ArrayList<>();
        
       Collections.sort(transactions);
       
       /* for(Transactions m : movimientos){//i

                for(Transactions m1 : movimientos){//j

                    if(Integer.parseInt(formato3.format(m.getFecha())) < Integer.parseInt(formato3.format(m1.getFecha())) ){//if(num[i] < num[j])

                        // ingrediente1.setNombre("1 Taza de Lentejas previamente remojadas por 3 horas y escurridas");
                        //ingredientes.add(ingrediente1);
                        //receta.setIngredientes(ingredientes);
                        //aux = num[i];
                        //num[i] = num[j];
                       // num[j] = aux;
                       
                       movimientos1.setFecha(m.getFecha());
                       movimientos1.setCantidad(m.getCantidad());
                       movimientos1.setDescripcion(m.getDescripcion());
                       movimientos1.setTipo(m.getTipo());
                       auxiliar.add(movimientos1);
                       cuenta.setAuxiliar01(auxiliar);
                       
                       movimientos2.setFecha(m1.getFecha());
                       movimientos2.setCantidad(m1.getCantidad());
                       movimientos2.setDescripcion(m1.getDescripcion());
                       movimientos2.setTipo(m1.getTipo());
                       auxiliar1.add(movimientos2);
                       cuenta.setAuxiliar02(auxiliar1);
                       
                       Transactions a = new Transactions();
                       cuenta.getAuxiliar01().add(a);
                       
                            movimientos3.setFecha(a.getFecha());
                            movimientos3.setCantidad(a.getCantidad());
                            movimientos3.setDescripcion(a.getDescripcion());
                            movimientos3.setTipo(a.getTipo());
                            auxiliar2.add(movimientos3);
                            cuenta.setAuxiliar03(auxiliar2);
                            
                    }

                    }

                }*/
        
        totalEnero = 0;
         totalFebrero = 0;
          totalMarzo = 0;
             totalAbril = 0;
        totalMayo = 0;
         totalJunio = 0;
         totalJulio = 0;
         totalAgosto = 0;
         totalSeptiembre = 0;
         totalOctubre = 0;
         totalNoviembre = 0;
       
         for(Transactions m : transactions){
             
             switch (formato.format(m.getDate())) {
            
                        case "01" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalEnero += m.getAmount();

                                   case RETIRO -> totalEnero -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "02" -> {   

                            switch(m.getType()){

                                   case DEPÓSITO -> totalFebrero += m.getAmount();

                                   case RETIRO -> totalFebrero -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "03" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalMarzo += m.getAmount();

                                   case RETIRO -> totalMarzo -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "04" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalAbril += m.getAmount();

                                   case RETIRO -> totalAbril -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "05" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalMayo += m.getAmount();

                                   case RETIRO -> totalMayo -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "06" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalJunio += m.getAmount();

                                   case RETIRO -> totalJunio -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "07" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalJulio += m.getAmount();

                                   case RETIRO -> totalJulio -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "08" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalAgosto += m.getAmount();

                                   case RETIRO -> totalAgosto -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "09" -> { 

                            switch(m.getType()){

                                   case DEPÓSITO -> totalSeptiembre += m.getAmount();

                                   case RETIRO -> totalSeptiembre -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "10" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalOctubre += m.getAmount();

                                   case RETIRO -> totalOctubre -= m.getAmount();

                                   default -> {
                     }

                               }

                        }

                        case "11" -> {

                            switch(m.getType()){

                                   case DEPÓSITO -> totalNoviembre += m.getAmount();

                                   case RETIRO -> totalNoviembre -= m.getAmount();

                                   default -> {
                     }

                               }
                    
                }

                    default -> {
                }

            }
             
         }
         
                  int posicion = 0;
                  float totalParcial = 0;
                  
        switch (mes) {
            
            case "Enero" -> {
                
                //mov.setSaldoAnterior(0);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("01")){
                    
                        //Ingrediente ingrediente1 = new Ingrediente();
                        // ingrediente1.setNombre("1 Taza de Lentejas previamente remojadas por 3 horas y escurridas");
                        // ingredientes.add(ingrediente1);
                        //receta.setIngredientes(ingredientes);
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                    
                    }
                    
                }
                
                //pasos.add(paso3);
                //receta.setPasos(pasos);
                //movimientosMes.add(movimientosOperacion);
                //cuenta.setMovimientosOp(movimientosMes);
                
            }
                
            case "Febrero" -> {
                
               // Transactions movimientosOperacion = new Transactions();
               //mov.setSaldoAnterior(totalEnero);
                
                for(Transactions m : transactions){
                
                    if(formato.format(m.getDate()).equals("02")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero  + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
           case "Marzo" -> {
               
               //mov.setSaldoAnterior(totalEnero + totalFebrero);
               
                for(Transactions m : transactions){
                
                    if(formato.format(m.getDate()).equals("03")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Abril" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("04")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Mayo" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("05")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Junio" -> {
                
               // mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo);
                
                for(Transactions m : transactions){
                
                    if(formato.format(m.getDate()).equals("06")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Julio" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("07")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Agosto" -> {
                
               // mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("08")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
            
            case "Septiembre" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("09")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Octubre" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("10")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Noviembre" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("11")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            case "Diciembre" -> {
                
                //mov.setSaldoAnterior(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre);
                
                for(Transactions m : transactions){
                    
                    if(formato.format(m.getDate()).equals("12")){
                        
                        Transactions movimientosOperacion = new Transactions();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));
                        
                        switch(m.getType()){
                           
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getAmount());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre - movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        
                    }
                    
                }
                
            }
                
            default -> {
            }
                
        }
        
        //System.out.println("Hola");
        
        return movimientosMes;
        
    }
    
    /**
     *  Aqui se calcula el saldo anterior al mes solicitado
     * @param mes Se recibe el mes con el que se van a hacer calculos
     * @param movimientos se recibe el ArrayList para los calculos
     * @return El saldo anterior al mes solicitado
     */

    public float obtenerSaldoInicial (String mes, List<Transactions> movimientos){
        
        float saldoInicial = 0;
        
        switch (mes) {
            
            case "Enero" -> {

                saldoInicial = 0;
                
            }
                
            case "Febrero" -> {

                saldoInicial = 0;
               saldoInicial = totalEnero;
                
            }
                
           case "Marzo" -> {
               
               saldoInicial = 0;
               saldoInicial = totalEnero + totalFebrero;
                
            }
                
            case "Abril" -> {
                
                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo;
                
            }
                
            case "Mayo" -> {
                
                saldoInicial = 0;
               saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril;
                
            }
                
            case "Junio" -> {
                
                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo;
                
            }
                
            case "Julio" -> {
                
                saldoInicial = 0;
               saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio;

                
            }
                
            case "Agosto" -> {
                
                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio;
                
            }
            
            case "Septiembre" -> {
                
                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto;
                
            }
                
            case "Octubre" -> {
                
                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre;
                
            }
                
            case "Noviembre" -> {
                
                saldoInicial = 0;
              saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre;
                
            }
                
            case "Diciembre" -> {
                
                saldoInicial = 0;
               saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre;
                
            }
                
            default -> {
            }
                
        }
        
        return saldoInicial;
        
    }
    
}
