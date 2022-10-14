package Nonthpawit.borntodev.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonhello = findViewById(R.id.buttonHello) as Button
        buttonhello.setOnClickListener {

            val name = findViewById(R.id.editTextName) as EditText
            val age  = findViewById(R.id.editTextAge) as EditText

            if (name.text.toString() == "" || age.text.toString() == ""){
                Toast.makeText(this,"Pleas Enter Your name and Age",Toast.LENGTH_LONG).show()
            }else{
                var introduce = "Hello my name is ${name.text} Im ${age.text} year old."
                val helloTextView = findViewById<TextView>(R.id.textViewHello)
                helloTextView.text = introduce
            }

        }

    }
}
