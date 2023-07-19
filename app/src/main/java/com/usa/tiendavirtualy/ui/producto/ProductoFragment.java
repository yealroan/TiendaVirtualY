package com.usa.tiendavirtualy.ui.producto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.usa.tiendavirtualy.R;
import com.usa.tiendavirtualy.ui.producto.adapter.ProductoAdapter;
import com.usa.tiendavirtualy.ui.producto.model.ProductoModel;

import java.util.LinkedList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductoFragment extends Fragment {

    RecyclerView recyclerViewProducto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_producto, container, false);
        recyclerViewProducto = view.findViewById(R.id.recyclerViewProducto);

        List<ProductoModel> productos = new LinkedList<>();
        productos.add(new ProductoModel("Adidas","Zapatos Elegantes",400000,R.drawable.zapatos1));
        productos.add(new ProductoModel("Fila","Zapatos Comodos",300000,R.drawable.zapatos2));
        productos.add(new ProductoModel("Brahama","Zapatos dia a dia",250000,R.drawable.zapatos3));
        productos.add(new ProductoModel("Croydon","Zapatos todo terreno",3500000,R.drawable.zapatos4));
        productos.add(new ProductoModel("Adidas","Zapatos Elegantes",400000,R.drawable.zapatos1));
        productos.add(new ProductoModel("Fila","Zapatos Comodos",400000,R.drawable.zapatos2));
        productos.add(new ProductoModel("Brahama","Zapatos dia a dia",400000,R.drawable.zapatos3));
        productos.add(new ProductoModel("Croydon","Zapatos todo terreno",400000,R.drawable.zapatos4));
        ProductoAdapter adapter =   new ProductoAdapter(productos);
        recyclerViewProducto.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewProducto.setAdapter(adapter);
        return view;
    }
}