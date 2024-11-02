package pe.edu.idat.ec2_JesusGamarra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pe.edu.idat.ec2_sm72896374.databinding.ActivityDetallesBinding

class DetallesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetallesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val nombre = intent.getStringExtra("nombre")
        val apellidos = intent.getStringExtra("apellidos")
        val dni = intent.getStringExtra("dni")
        val celular = intent.getStringExtra("celular")
        val email = intent.getStringExtra("email")
        val cualidades = intent.getStringExtra("cualidades")
        val carrera = intent.getStringExtra("carrera")


        val detallesTexto = """
            Nombre: $nombre
            Apellidos: $apellidos
            DNI: $dni
            Celular: $celular
            Email: $email
            Cualidades: $cualidades
            Carrera: $carrera
        """.trimIndent()


        binding.tvDetalles.text = detallesTexto
    }
}