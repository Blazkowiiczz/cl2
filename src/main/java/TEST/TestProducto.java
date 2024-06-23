package TEST;

import java.util.List;

import DAO.ClassProductoImp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		TblProductocl2 producto = new TblProductocl2();
        ClassProductoImp crud = new ClassProductoImp();

        
     /*   //Testeamos el metodo registrar
        producto.setNombrecl2("chicha");
        producto.setPrecioventacl2(3.20);
        producto.setPreciocompcl2(1.20);
        producto.setEstadocl2("Buenazo");
        producto.setDescripcl2("chicha12 650ml");
        crud.RegistrarProducto(producto);
        
*/

       //Testeamos el metodo listar
        List<TblProductocl2> listarProducto = crud.ListarProducto();
        for(TblProductocl2 p:listarProducto){
            System.out.println("Código: "+p.getIdproductocl2()+"\n"+
                                "Nombre: "+p.getNombrecl2()+"\n"+
                                "Precio de Venta: "+p.getPrecioventacl2()+"\n"+
                                "Precio de Compra: "+p.getPreciocompcl2()+"\n"+
                                "Estado: "+p.getEstadocl2()+"\n"+
                                "Descripción: "+p.getDescripcl2()+"\n");
        }

	}

}
