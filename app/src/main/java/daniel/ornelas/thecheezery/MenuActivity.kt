package daniel.ornelas.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnColdDrinks: Button = findViewById(R.id.btn_cold_drinks) as Button

        btnColdDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ColdProducts::class.java)


            startActivity(intent)
        }

        var btnHotDrinks: Button = findViewById(R.id.btn_hot_drinks) as Button

        btnHotDrinks.setOnClickListener {
            var intent: Intent = Intent(this, HotProducts::class.java)


            startActivity(intent)
        }

        var btnSweets: Button = findViewById(R.id.btn_sweets) as Button
        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this, SweetsProducts::class.java)


            startActivity(intent)
        }

        var btnSalties: Button = findViewById(R.id.btn_salties) as Button
        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, SaltiesProducts::class.java)


            startActivity(intent)
        }

    }
}