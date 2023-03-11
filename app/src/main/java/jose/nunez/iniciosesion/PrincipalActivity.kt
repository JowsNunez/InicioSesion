package jose.nunez.iniciosesion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import jose.nunez.iniciosesion.R

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val bundle = intent.extras

        var nameTxt: TextView = findViewById(R.id.tv_name)
        var emailTxt: TextView = findViewById(R.id.tv_email)
        if (bundle != null) {
            val name = bundle.getString("name")
            val correo = bundle.getString("emal")

            nameTxt.text = name
            emailTxt.text = correo
        }

        var btn_cerrar: Button = findViewById(R.id.btn_cerrar)
        btn_cerrar.setOnClickListener {
            finish()
        }

    }
}