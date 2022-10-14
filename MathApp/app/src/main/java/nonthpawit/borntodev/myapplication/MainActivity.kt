package nonthpawit.borntodev.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnNextActivityOnClick(view: View){
        var ThisisSecondActivityIntent = Intent(this,ThisisSecondActivity::class.java)
        startActivity(ThisisSecondActivityIntent)
    }
}