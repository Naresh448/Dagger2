package sample.naresh.com.checkdagger

import dagger.BindsInstance
import dagger.Component

/**
 * Created by nareshkumar.reddy on 1/12/2018.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface AppComponent {

    fun plus(mainModule: MainModule): MainComponent

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: DemoApplication): Builder
    }
}