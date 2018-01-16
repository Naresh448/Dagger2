package sample.naresh.com.checkdagger

import android.app.Application

/**
 * Created by nareshkumar.reddy on 1/12/2018.
 */
class DemoApplication : Application() {


    companion object {
        var applicationComponent : AppComponent? = null
    }


    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerAppComponent.builder().application(this).build()

    }

}