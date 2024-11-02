package pe.edu.idat.ec2_JesusGamarra

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import pe.edu.idat.ec2_sm72896374.databinding.ActivityPaisesBinding

class PaisesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaisesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaisesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val paises = listOf(
            "Peru",
            "Colombia",
            "Ecuador",
            "Argentina",
            "Bolivia",
            "Chile",
            "Ecuador",
            "Mexico"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, paises)
        binding.listViewLibros.adapter = adapter
    }
}