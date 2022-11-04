package nonthpawit.borntodev.hackhack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.Calendar

class Date : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        val picker = findViewById<DatePicker>(R.id.datePicker)
        val today = Calendar.getInstance()
        picker.init(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH)){
            view,year,month,day ->
            val month = month+1
            val toast = "You have Selected : $day/$month/$year"
            Toast.makeText(this,toast,Toast.LENGTH_SHORT).show()
        }
    }
}