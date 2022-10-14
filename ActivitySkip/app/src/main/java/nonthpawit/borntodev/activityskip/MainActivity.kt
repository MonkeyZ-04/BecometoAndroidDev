package nonthpawit.borntodev.activityskip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnNavigationOnClick(view: View){
        //Navigate from MainActivity to SecondActivity
        var SecondActivityIntent = Intent(this,SecondActivity::class.java)
        SecondActivityIntent.putExtra("firstName","Nonthpawit")
        //Send Data to Another Activity
        SecondActivityIntent.putExtra("lastName","MonkeyZ")
        startActivity(SecondActivityIntent)
    }

}