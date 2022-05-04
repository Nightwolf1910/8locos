package pe.edu.ulima.pm.a8locos

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View

class Cartas: View{
    public var numero:Int?=null
    public var simbolo:String?=null
    constructor(context: Context):super(context){


    }

    fun cargarImagenes(){
        val img_cartas= arrayOf<Int>(
            //Corazones
            R.drawable.as_corazones,
            R.drawable.dos_corazones,
            R.drawable.tres_corazones,
            R.drawable.cuatro_corazones,
            R.drawable.cinco_corazones,
            R.drawable.seis_corazones,
            R.drawable.siete_corazones,
            R.drawable.ocho_corazones,
            R.drawable.nueve_corazones,
            R.drawable.diez_corazones,
            R.drawable.once_corazones,
            R.drawable.doce_corazones,
            R.drawable.trece_corazones,
            //Trebol
            R.drawable.as_trebol,
            R.drawable.dos_trebol,
            R.drawable.tres_trebol,
            R.drawable.cuatro_trebol,
            R.drawable.cinco_trebol,
            R.drawable.seis_trebol,
            R.drawable.siete_trebol,
            R.drawable.ocho_trebol,
            R.drawable.nueve_trebol,
            R.drawable.diez_trebol,
            R.drawable.once_trebol,
            R.drawable.doce_trebol,
            R.drawable.trece_trebol,
            //Diamantes
            R.drawable.as_diamantes,
            R.drawable.dos_diamantes,
            R.drawable.tres_diamantes,
            R.drawable.cuatro_diamantes,
            R.drawable.cinco_diamantes,
            R.drawable.seis_diamante, // Corregir
            R.drawable.siete_diamantes,
            R.drawable.ocho_diamantes,
            R.drawable.nueve_diamantes,
            R.drawable.diez_diamantes,
            R.drawable.once_diamantes,
            R.drawable.doce_diamantes,
            R.drawable.trece_diamantes,
            //Picas
            R.drawable.as_picas,
            R.drawable.dos_picas,
            R.drawable.tres_picas,
            R.drawable.cuatro_picas,
            R.drawable.cinco_picas,
            R.drawable.seis_picas,
            R.drawable.siete_picas,
            R.drawable.ocho_picas,
            R.drawable.nueve_picas,
            R.drawable.diez_picas,
            R.drawable.once_picas,
            R.drawable.doce_picas,
            R.drawable.trece_picas,
            //Back
            R.drawable.mazo,

        )
        }




}

