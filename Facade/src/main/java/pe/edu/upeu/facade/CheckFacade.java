/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.facade;

import pe.edu.upeu.api.AvionAPI;
import pe.edu.upeu.api.HotelAPI;

/**
 *
 * @author DELL
 */
public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
    }
    
    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaIda, origen, destino);
    }
}
