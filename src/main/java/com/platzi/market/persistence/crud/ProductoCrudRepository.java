package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//CrudRepository<(Tabla o entidad), (tipo de dato de la llave primaria)>
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    //Ejemplo de como realizarlo con el query nativo sql
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    //  List<Producto> getByCategoria(int idCategoria);


    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);




}
