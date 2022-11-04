package nonthpawit.borntodev.hackhack

import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import nonthpawit.borntodev.hackhack.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    var firstName: String? = null
    var lastName: String? = null
    var age: String? = null
    var userName: String? = null
    var db: FirebaseDatabase? = null
    var reference: DatabaseReference? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.registerBtn.setOnClickListener(View.OnClickListener {
            firstName = binding!!.firstName.text.toString()
            lastName = binding!!.lastName.text.toString()
            age = binding!!.age.text.toString()
            userName = binding!!.userName.text.toString()
            if (!firstName!!.isEmpty() && !lastName!!.isEmpty() && !age!!.isEmpty() && !userName!!.isEmpty()) {
                val users = Users(firstName, lastName, age, userName)
                db = FirebaseDatabase.getInstance()
                reference = db!!.getReference("Users")
                reference!!.child(userName!!).setValue(users).addOnCompleteListener {
                    binding!!.firstName.setText("")
                    binding!!.lastName.setText("")
                    binding!!.age.setText("")
                    binding!!.userName.setText("")
                    Toast.makeText(this@MainActivity, "Successfuly Updated", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })



    }
}