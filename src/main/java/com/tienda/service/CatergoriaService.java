

package com.tienda.service;

/**
 *
 * @author Franco
 */
import java.util.List;
import  com.tienda.domain.Categoria;

public interface CatergoriaService {
   public List<Categoria> getCategorias(boolean activos);

}
