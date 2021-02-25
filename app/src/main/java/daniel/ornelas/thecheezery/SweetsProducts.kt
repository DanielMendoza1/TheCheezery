package daniel.ornelas.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SweetsProducts : AppCompatActivity() {

    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweets_products)

        agregaProductos()

        var listView: ListView = findViewById<ListView>(R.id.listView)

        var adaptador: AdaptadorProductos = AdaptadorProductos(this,products)
        listView.adapter = adaptador
    }

    fun agregaProductos(){

        products.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6.0))
        products.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3.0))
        products.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4.0))
        products.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6.0))
        products.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7.0))
        products.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6.0))

    }
}