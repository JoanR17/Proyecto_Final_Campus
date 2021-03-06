package ProyectoFinal.ReservesMenjador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoFinal.ReservesMenjador.dao.IRolDAO;
import ProyectoFinal.ReservesMenjador.dto.Rol;

@Service
public class RolServicesImpl implements IRolSERVICES{
	
	@Autowired
	IRolDAO rolDAO;

	@Override
	public List<Rol> totalRegistro() {
		return rolDAO.findAll();
	}

	@Override
	public Rol ubicaPorID(int id) {
		return rolDAO.findById(id).get();
	}

	@Override
	public void eliminaRegistroPorID(int id) {
		rolDAO.deleteById(id);
	}

	@Override
	public Rol agregaRegistro(Rol rol) {
		return rolDAO.save(rol);
	}

	@Override
	public Rol actualizaResgistro(Rol rol) {
		return rolDAO.save(rol);
	}

}
