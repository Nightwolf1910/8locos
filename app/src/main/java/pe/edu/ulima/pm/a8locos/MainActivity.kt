package pe.edu.ulima.pm.a8locos

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import androidx.annotation.DrawableRes

class MainActivity : AppCompatActivity() {
    val simbolos= arrayOf<Int>(0,1,2,3)
    //0=corazon,1=rombo,2=espada,3=trebol
    val numeros= arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13)
    var cartas= Array(52,{IntArray(2)})
    var barajaMe=Array(8,{IntArray(2)})
    var barajaJ2=Array(8,{IntArray(2)})
    var barajaJ3=Array(8,{IntArray(2)})
    var barajaaleatoria=Array(52,{IntArray(2)})
    var mesa=Array(1,{IntArray(2)})

    //val Imagen: ImageView=findViewById(R.id.mesa)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cartaMesa=findViewById<ImageView>(R.id.mesa)
        val carta11=findViewById<ImageView>(R.id.iv11)
        val carta21=findViewById<ImageView>(R.id.iv12)
        val carta31=findViewById<ImageView>(R.id.iv13)
        val carta41=findViewById<ImageView>(R.id.iv14)
        val carta51=findViewById<ImageView>(R.id.iv15)
        val carta61=findViewById<ImageView>(R.id.iv16)
        val carta71=findViewById<ImageView>(R.id.iv17)
        val carta81=findViewById<ImageView>(R.id.iv18)
        val carta12=findViewById<ImageView>(R.id.iv21)
        val carta22=findViewById<ImageView>(R.id.iv22)
        val carta32=findViewById<ImageView>(R.id.iv23)
        val carta42=findViewById<ImageView>(R.id.iv24)
        val carta52=findViewById<ImageView>(R.id.iv25)
        val carta62=findViewById<ImageView>(R.id.iv26)
        val carta72=findViewById<ImageView>(R.id.iv27)
        val carta82=findViewById<ImageView>(R.id.iv28)
        val carta13=findViewById<ImageView>(R.id.iv31)
        val carta23=findViewById<ImageView>(R.id.iv32)
        val carta33=findViewById<ImageView>(R.id.iv33)
        val carta43=findViewById<ImageView>(R.id.iv34)
        val carta53=findViewById<ImageView>(R.id.iv35)
        val carta63=findViewById<ImageView>(R.id.iv36)
        val carta73=findViewById<ImageView>(R.id.iv37)
        val carta83=findViewById<ImageView>(R.id.iv38)
        llenarcartas()
        aleatoriedad()
        //var barajaMeImage= arrayOf<ImageView>(carta11;carta22;carta31;carta41;carta51;carta61;carta71;carta81)
        repartir(barajaMe)
        repartir(barajaJ2)
        repartir(barajaJ3)
        mesa[0][0]=cartas[0][0]
        mesa[0][1]=cartas[0][1]
        cartas.drop(0)
        var mesaView= arrayOf<ImageView>(cartaMesa)
        mostrarCartas(mesaView,mesa)
    }

    fun aleatoriedad(){
        var barajaAux= arrayOf<Int>(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51)
        var aux=Array(52,{IntArray(2)})
        barajaAux.shuffle()
        for (i in 0..cartas.size-1){
            aux[i][0]=cartas[barajaAux[i]][0]
            aux[i][1]=cartas[barajaAux[i]][1]
        }
        cartas=aux
    }


    fun llenarcartas(){
        for (i in 0..cartas[0].size-1){
            cartas[i][0]=(i%13)+1
            cartas[i][1]=i%4
        }
    }
    fun repartir(baraja:Array<IntArray>){
        for (i in 0..7){
            baraja[i][0]=cartas[i][0]
            baraja[i][1]=cartas[i][1]
            cartas.drop(1)
        }
    }
    fun mostrar(){
        for(i in 0..cartas.size-1){
            for(j in 0..cartas[0].size-1){
                print(cartas[i][j])
                print(" ")
            }
            println("")
        }
    }
    fun mostrarCartas(barajaView:Array<ImageView>,baraja: Array<IntArray>){
        for (i in 0..barajaView.size-1){
            when {
                baraja[i][0]==0&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.cinco_corazones)
                baraja[i][0]==1&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.as_corazones)
                baraja[i][0]==2&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.dos_corazones)
                baraja[i][0]==3&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.tres_corazones)
                baraja[i][0]==4&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.cuatro_corazones)
                baraja[i][0]==5&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.cinco_corazones)
                baraja[i][0]==6&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.seis_corazones)
                baraja[i][0]==7&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.siete_corazones)
                baraja[i][0]==8&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.ocho_corazones)
                baraja[i][0]==9&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.nueve_corazones)
                baraja[i][0]==10&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.diez_corazones)
                baraja[i][0]==11&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.once_corazones)
                baraja[i][0]==12&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.doce_corazones)
                baraja[i][0]==13&&baraja[i][1]==0->barajaView[i].setImageResource(R.drawable.trece_corazones)
                baraja[i][0]==1&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.as_diamantes)
                baraja[i][0]==2&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.dos_diamantes)
                baraja[i][0]==3&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.tres_diamantes)
                baraja[i][0]==4&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.cuatro_diamantes)
                baraja[i][0]==5&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.cinco_diamantes)
                baraja[i][0]==6&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.seis_diamante)
                baraja[i][0]==7&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.siete_diamantes)
                baraja[i][0]==8&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.ocho_diamantes)
                baraja[i][0]==9&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.nueve_diamantes)
                baraja[i][0]==10&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.diez_diamantes)
                baraja[i][0]==11&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.once_diamantes)
                baraja[i][0]==12&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.doce_diamantes)
                baraja[i][0]==13&&baraja[i][1]==1->barajaView[i].setImageResource(R.drawable.trece_diamantes)
                baraja[i][0]==1&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.as_picas)
                baraja[i][0]==2&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.dos_picas)
                baraja[i][0]==3&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.tres_picas)
                baraja[i][0]==4&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.cuatro_picas)
                baraja[i][0]==5&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.cinco_picas)
                baraja[i][0]==6&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.seis_picas)
                baraja[i][0]==7&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.siete_picas)
                baraja[i][0]==8&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.ocho_picas)
                baraja[i][0]==9&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.nueve_picas)
                baraja[i][0]==10&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.diez_picas)
                baraja[i][0]==11&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.once_picas)
                baraja[i][0]==12&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.doce_picas)
                baraja[i][0]==13&&baraja[i][1]==2->barajaView[i].setImageResource(R.drawable.trece_picas)
                baraja[i][0]==1&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.as_trebol)
                baraja[i][0]==2&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.dos_trebol)
                baraja[i][0]==3&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.tres_trebol)
                baraja[i][0]==4&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.cuatro_trebol)
                baraja[i][0]==5&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.cinco_trebol)
                baraja[i][0]==6&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.seis_trebol)
                baraja[i][0]==7&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.siete_trebol)
                baraja[i][0]==8&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.ocho_trebol)
                baraja[i][0]==9&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.nueve_trebol)
                baraja[i][0]==10&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.diez_trebol)
                baraja[i][0]==11&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.once_trebol)
                baraja[i][0]==12&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.doce_trebol)
                baraja[i][0]==13&&baraja[i][1]==3->barajaView[i].setImageResource(R.drawable.trece_trebol)
            }
        }
    }
}