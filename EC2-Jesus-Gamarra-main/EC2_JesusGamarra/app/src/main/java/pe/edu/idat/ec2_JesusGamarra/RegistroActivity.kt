package pe.edu.idat.ec2_JesusGamarra

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pe.edu.idat.ec2_sm72896374.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAcceder.setOnClickListener {

            val nombre = binding.etNombre.text.toString()
            val apellidos = binding.etApellidos.text.toString()
            val dni = binding.etDNI.text.toString()
            val celular = binding.etCelular.text.toString()
            val email = binding.etEmail.text.toString()


            val cualidades = mutableListOf<String>()
            if (binding.cbPuntual.isChecked) cualidades.add("Puntual")
            if (binding.cbRespetuoso.isChecked) cualidades.add("Respetuoso")
            if (binding.cbResponsable.isChecked) cualidades.add("Responsable")
            if (binding.cbOtro.isChecked) {
                cualidades.add("Otro: ${binding.etOtraCualidad.text}")
            }


            val carreraSeleccionada = when (binding.rgCarrera.checkedRadioButtonId) {
                binding.rbIngenieria.id -> "Ingeniería"
                binding.rbCienciasMedicas.id -> "Ciencias médicas"
                binding.rbAdministracion.id -> "Administración"
                binding.rbOtro.id -> "Otro"
                else -> "No especificado"
            }


            val intent = Intent(this, DetallesActivity::class.java).apply {
                putExtra("nombre", nombre)
                putExtra("apellidos", apellidos)
                putExtra("dni", dni)
                putExtra("celular", celular)
                putExtra("email", email)
                putExtra("cualidades", cualidades.joinToString(", "))
                putExtra("carrera", carreraSeleccionada)
            }
            startActivity(intent)
        }
    }
}