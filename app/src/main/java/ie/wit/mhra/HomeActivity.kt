package ie.wit.mhra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.system.Os.close
import android.system.Os.open
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.navView)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navHome -> Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT).show()
                R.id.navQuestion -> Toast.makeText(applicationContext, "Clicked Questionnaire", Toast.LENGTH_SHORT).show()
                R.id.navRelief -> Toast.makeText(applicationContext, "Clicked Instant Relief", Toast.LENGTH_SHORT).show()
                R.id.navLearning -> Toast.makeText(applicationContext, "Clicked Learning", Toast.LENGTH_SHORT).show()
                R.id.navPersonal -> Toast.makeText(applicationContext, "Clicked Personal", Toast.LENGTH_SHORT).show()
                R.id.navAccount -> Toast.makeText(applicationContext, "Clicked My Account", Toast.LENGTH_SHORT).show()
                R.id.navLogin -> Toast.makeText(applicationContext, "Clicked Login", Toast.LENGTH_SHORT).show()
                R.id.navSettings -> Toast.makeText(applicationContext, "Clicked Settings", Toast.LENGTH_SHORT).show()
                R.id.navReview -> Toast.makeText(applicationContext, "Clicked Review", Toast.LENGTH_SHORT).show()
            }

            true
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}