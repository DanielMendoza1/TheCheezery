package daniel.ornelas.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById<Button>(R.id.btn_get_started)

        btn.setOnClickListener {
            var intent: Intent= Intent(this, Register_activity::class.java)
            startActivity(intent)
        }
    }
}