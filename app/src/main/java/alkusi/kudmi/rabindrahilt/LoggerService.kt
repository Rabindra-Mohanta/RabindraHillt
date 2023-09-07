package alkusi.kudmi.rabindrahilt

import android.util.Log
import javax.inject.Inject
const val TAG1 = "hilt"
class LoggerService @Inject constructor(){
    fun log(email:String,password:String)
    {
        Log.e(TAG1,"rabi->"+email+"->"+password)
    }
}