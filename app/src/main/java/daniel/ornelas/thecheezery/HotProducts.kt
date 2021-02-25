package daniel.ornelas.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class HotProducts : AppCompatActivity() {

    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot_products)

        agregaProductos()

        var listView: ListView = findViewById<ListView>(R.id.listView)

        var adaptador: AdaptadorProductos = AdaptadorProductos(this,products)
        listView.adapter = adaptador
    }

    fun agregaProductos(){

        products.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6.0))
        products.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5.0))
        products.add(Product("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4.0))
        products.add(Product("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6.0))
        products.add(Product("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7.0))
        products.add(Product("American coffee", R.drawable.americano, "Espresso with hot water", 2.0))

    }
}