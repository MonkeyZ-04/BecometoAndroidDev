package nonthpawit.borntodev.listviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listViewData : Array<String> = arrayOf("Dog","Cat","Bird","Lizard","Bug","Fish")

        var lsitViewAdapter : ArrayAdapter<String> = ArrayAdapter(this
            ,android.R.layout.simple_list_item_1,listViewData)
        val findviewdata = findViewById(R.id.listView1) as ListView

        findviewdata.adapter = lsitViewAdapter
    }
}