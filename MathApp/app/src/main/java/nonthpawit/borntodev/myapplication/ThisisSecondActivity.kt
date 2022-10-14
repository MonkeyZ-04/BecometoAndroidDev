package nonthpawit.borntodev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThisisSecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thisis_second)
        var checkBox1 = false
        var checkBox2 = false
        var checkBox3 = false
        var checkBox4 = false
        var checkBox5 = false
        var checkBox6 = false
        var checkBox7 = false
        var clearbox  = false


        val btnnum1 = findViewById(R.id.btn_nb1) as Button
        btnnum1.setOnClickListener{
            checkBox1 = true
        }

        val btnnum2 = findViewById(R.id.btn_nb2) as Button
        btnnum2.setOnClickListener{
            checkBox2 = true
        }

        val btnnum3 = findViewById(R.id.btn_nb3) as Button
        btnnum3.setOnClickListener{
            checkBox3 = true
        }

        val btnnum4 = findViewById(R.id.btn_nb4) as Button
        btnnum4.setOnClickListener{
            checkBox4 = true
        }

        val btnoperator1 = findViewById(R.id.btn_minus) as Button
        btnoperator1.setOnClickListener{
            checkBox5 = true
        }

        val btnoperator2 = findViewById(R.id.btn_multiply) as Button
        btnoperator2.setOnClickListener{
            checkBox6 = true
        }

        val btnoperator3 = findViewById(R.id.btn_divide) as Button
        btnoperator3.setOnClickListener{
            checkBox7 = true
        }

        val btnclear = findViewById(R.id.btn_clear) as Button
        btnclear.setOnClickListener{
             clearbox = true
            if (clearbox != true){
                var textView3 = findViewById(R.id.textView3) as TextView
                var NotCorrect = " "
                textView3.text = NotCorrect
            }
        }


        val btnsubmit = findViewById(R.id.btn_submit) as Button
        btnsubmit.setOnClickListener{
            if (checkBox1 && checkBox2 && checkBox3 && checkBox4 && checkBox5 && checkBox6 && checkBox7 == true) {
                var textView3 = findViewById(R.id.textView3) as TextView
                var Correct = "Correct"
                textView3.text = Correct
            } else {
                var textView3 = findViewById(R.id.textView3) as TextView
                var NotCorrect = "false"
                textView3.text = NotCorrect
            }
        }


    }

}