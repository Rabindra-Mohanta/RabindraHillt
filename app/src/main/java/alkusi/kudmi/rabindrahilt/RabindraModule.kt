package alkusi.kudmi.rabindrahilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(SingletonComponent::class)
@Module
 class RabindraModule {

//    @Binds
//    abstract fun provideRabindra(saveInFireBase:SaveInFirebase):Rabindra;

    @Provides
    @Named("rabi")
    fun getSqLite(saveInFirebase: SaveInFirebase):Rabindra
    {
        return saveInFirebase;
    }

    @Provides
    @FirebaseAnnotation
    fun saveInFireBase(saveInApi: SaveInApi):Rabindra
    {
        return saveInApi;
    }

}