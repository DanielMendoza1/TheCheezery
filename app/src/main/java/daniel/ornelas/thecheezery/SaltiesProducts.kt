package daniel.ornelas.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SaltiesProducts : AppCompatActivity() {

    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salties_products)

        agregaProductos()

        var listView: ListView = findViewById<ListView>(R.id.listView)

        var adaptador: AdaptadorProductos = AdaptadorProductos(this,products)
        listView.adapter = adaptador
    }

    fun agregaProductos(){

        products.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
        products.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5.0))
        products.add(Product("Panini", R.drawable.clubsandwich, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
        products.add(Product("Philly cheese steak", R.drawable. phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
        products.add(Product("Nachos", R.drawable. nachos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))

    }
}