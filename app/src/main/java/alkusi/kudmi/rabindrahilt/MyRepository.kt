package alkusi.kudmi.rabindrahilt

import android.util.Log
import javax.inject.Inject

const val TAG = "Rabindra"
class MyRepository @Inject constructor(val loggerService: LoggerService){
   fun saveData(email:String,password:String)
   {
      loggerService.log(email,password)
   }
}