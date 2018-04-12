package paulck.test_kotlin_stackoverflow

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      //  paulck.test_kotlin_stackoverflow.CustomEditText. = View.VISIBLE
    }

    fun changeToActivity2(v: View){
        val intent = Intent(this, MainActivity2::class.java)
// To pass any data to next activity

// start your next activity
        startActivity(intent)

    }


}
