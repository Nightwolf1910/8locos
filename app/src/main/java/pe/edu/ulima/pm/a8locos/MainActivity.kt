package pe.edu.ulima.pm.a8locos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.reflect.Array
import pe.edu.ulima.pm.a8locos.Cartas

class MainActivity : AppCompatActivity() {
    val simbolos= arrayOf<String>("corazon","rombo","espada","trebol")
    val numeros= arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13)
    val cartas= Array(2,{IntArray(13)})
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cartaMesa=findViewById<Cartas>(R.id.mesa)
        val carta11=findViewById<Cartas>(R.id.mesa)
        val carta21=findViewById<Cartas>(R.id.mesa)
        val carta31=findViewById<Cartas>(R.id.mesa)
        val carta41=findViewById<Cartas>(R.id.mesa)
        val carta51=findViewById<Cartas>(R.id.mesa)
        val carta61=findViewById<Cartas>(R.id.mesa)
        val carta71=findViewById<Cartas>(R.id.mesa)
        val carta81=findViewById<Cartas>(R.id.mesa)
        val carta12=findViewById<Cartas>(R.id.mesa)
        val carta22=findViewById<Cartas>(R.id.mesa)
        val carta32=findViewById<Cartas>(R.id.mesa)
        val carta42=findViewById<Cartas>(R.id.mesa)
        val carta52=findViewById<Cartas>(R.id.mesa)
        val carta62=findViewById<Cartas>(R.id.mesa)
        val carta72=findViewById<Cartas>(R.id.mesa)
        val carta82=findViewById<Cartas>(R.id.mesa)
        val carta13=findViewById<Cartas>(R.id.mesa)
        val carta23=findViewById<Cartas>(R.id.mesa)
        val carta33=findViewById<Cartas>(R.id.mesa)
        val carta43=findViewById<Cartas>(R.id.mesa)
        val carta53=findViewById<Cartas>(R.id.mesa)
        val carta63=findViewById<Cartas>(R.id.mesa)
        val carta73=findViewById<Cartas>(R.id.mesa)
        val carta83=findViewById<Cartas>(R.id.mesa)



    }
    fun aleatorio(carta: Cartas){
        carta.numero=numeros.random()
        carta.simbolo=simbolos.random()

    }
}