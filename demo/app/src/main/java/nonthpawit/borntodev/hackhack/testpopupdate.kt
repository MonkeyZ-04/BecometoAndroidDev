package nonthpawit.borntodev.hackhack

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.util.*


class testpopupdate : AppCompatActivity() {

    var formatDate = SimpleDateFormat("dd MMMM YYYY",Locale.US)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testpopupdate)


    }
}