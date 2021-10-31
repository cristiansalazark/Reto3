/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_Ciclo3.Reto3_Ciclo3.Interfaces;

import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceReservation extends CrudRepository<Reservation,Integer>{
    
}