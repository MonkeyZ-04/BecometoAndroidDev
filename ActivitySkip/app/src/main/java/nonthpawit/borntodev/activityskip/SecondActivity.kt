package nonthpawit.borntodev.activityskip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intentData = intent.extras

        Toast.makeText(this,intentData!!.getString("firstName"), Toast.LENGTH_LONG).show()
    }
}