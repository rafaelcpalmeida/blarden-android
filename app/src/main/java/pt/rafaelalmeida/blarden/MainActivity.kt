package pt.rafaelalmeida.blarden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.os.StrictMode



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val openDoorButton = findViewById<Button>(R.id.openDoorButton)
        val openDoorRequest = OpenDoorRequest()

        openDoorButton.setOnClickListener {
            openDoorRequest.requestDoorOpen()
            Toast.makeText(this@MainActivity, "Door opened", Toast.LENGTH_SHORT).show()
        }
    }
}
