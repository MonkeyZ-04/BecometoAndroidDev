package nonthpawit.borntodev.hackhack

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class Date : AppCompatActivity() {
    var formatDate = SimpleDateFormat("dd MMMM YYYY", Locale.US)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        val btn_pick_date = findViewById(R.id.btn_pick_date) as Button
        val textview_get_date = findViewById(R.id.textview_get_date) as TextView
        btn_pick_date.setOnClickListener(View.OnClickListener {
            val getDate = Calendar.getInstance()
            val datepicker = DatePickerDialog(this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->

                val selectDate = Calendar.getInstance()
                selectDate.set(Calendar.YEAR,i)
                selectDate.set(Calendar.MONTH,i2)
                selectDate.set(Calendar.DAY_OF_MONTH,i3)
                val date : String = formatDate.format(selectDate.time)
                Toast.makeText(this,"Date : "+date,Toast.LENGTH_SHORT).show()
                textview_get_date.text=date

            },getDate.get(Calendar.YEAR),getDate.get(Calendar.MONTH),getDate.get(Calendar.DAY_OF_MONTH))
            datepicker.show()
        })
    }
}