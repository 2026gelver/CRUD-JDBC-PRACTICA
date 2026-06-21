package com.nombreempresa.sistemaventas.main;

import com.nombreempresa.sistemaventas.dao.ProductoDAO;
import com.nombreempresa.sistemaventas.model.Producto;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductoDAO dao = new ProductoDAO();

        // ➕ INSERT
        System.out.println("--- INSERTAR ---");
        Producto nuevo = new Producto(0, "Laptop", 2500000.0, 10);
        dao.insertar(nuevo);

        // 🔍 READ
        System.out.println("\n--- LISTAR ---");
        List<Producto> lista = dao.listarTodos();
        for (Producto p : lista) {
            System.out.println(p);
        }

        // ✏️ UPDATE
        System.out.println("\n--- ACTUALIZAR ---");
        Producto actualizado = new Producto(1, "Laptop Gamer", 3200000.0, 5);
        dao.actualizar(actualizado);

        // 🗑️ DELETE
        System.out.println("\n--- ELIMINAR ---");
        dao.eliminar(1);
    }
}