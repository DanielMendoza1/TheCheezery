package daniel.ornelas.thecheezery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorProductos: BaseAdapter {
    var productos = ArrayList<Product>()
    var contexto: Context? = null

    constructor(context: Context, productos: ArrayList<Product>){
        this.productos = productos
        this.contexto = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var prod = productos[position]
        var inflador = LayoutInflater.from(contexto)
        var vista = inflador.inflate(R.layout.producto_view, null)

        var image = vista.findViewById(R.id.producto_img) as ImageView
        var nombre = vista.findViewById(R.id.producto_nombre) as TextView
        var desc = vista.findViewById(R.id.producto_desc) as TextView
        var precio = vista.findViewById(R.id.producto_precio) as TextView

        image.setImageResource(prod.image)
        nombre.setText(prod.name)
        desc.setText(prod.description)
        precio.setText("$${prod.price}")

        return vista
    }

    override fun getItem(position: Int): Any {
        return productos[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return productos.size
    }
}