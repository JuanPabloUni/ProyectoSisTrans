package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.CuentaConsumo;
import uniandes.edu.co.proyecto.modelo.CuentaConsumoPK;
import uniandes.edu.co.proyecto.modelo.Reserva;
import uniandes.edu.co.proyecto.modelo.Servicio;
import uniandes.edu.co.proyecto.repository.CuentaConsumoRepository;
import uniandes.edu.co.proyecto.repository.ReservaRepository;
import uniandes.edu.co.proyecto.repository.ServicioRepository;

@Controller
public class CuentaConsumoController {

    @Autowired
    private CuentaConsumoRepository cuentaConsumoRepository;

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping("/cuentaConsumos/new")
    public String cuentaConsumoForm(Model model) {
        model.addAttribute("reservas", reservaRepository.darReservas());
        model.addAttribute("servicios", servicioRepository.darServicios());
        return "cuentaConsumosForm";
    }

    @PostMapping("/cuentaConsumos/new/save")
    public String cuentaConsumoSave(@ModelAttribute("reservas_id") int reservas_id, @ModelAttribute("servicios_id") int servicios_id) {
        
        Reserva reserva = reservaRepository.darReserva(reservas_id);
        Servicio servicio = servicioRepository.darServicio(servicios_id);
        CuentaConsumoPK pk = new CuentaConsumoPK(reserva, servicio);
        CuentaConsumo cuentaConsumo = new CuentaConsumo();
        cuentaConsumo.setPk(pk);
        cuentaConsumoRepository.insertarCuentaConsumo(cuentaConsumo.getPk().getId_Reserva().getId(), cuentaConsumo.getPk().getId_Servicio().getId());

        return "redirect:/cuentaConsumos";
    }
    
}
