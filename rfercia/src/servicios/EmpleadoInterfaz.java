package servicios;

import java.util.List;

import dtos.VentaDto;

public interface EmpleadoInterfaz {

	public void aniadirVenta(List<VentaDto> listaVentas);
	
	public void ventaTotalDiaria(List<VentaDto>listaVentas);
}
