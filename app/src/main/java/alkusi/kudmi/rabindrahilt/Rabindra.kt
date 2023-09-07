package alkusi.kudmi.rabindrahilt

import android.util.Log
import javax.inject.Inject

interface Rabindra {

    fun saveData(message:String)
}

class SaveInApi @Inject constructor():Rabindra
{
    override fun saveData(message: String) {

        Log.e("Rabindra",message+"->Saved in Api")
    }

}
class SaveInFirebase @Inject constructor():Rabindra
{
    override fun saveData(message: String) {
        Log.e("Rabindra",message+"->saved in firebase")
    }

}