package sample.naresh.com.checkdagger

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

/**
 * Created by nareshkumar.reddy on 1/12/2018.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(mainActivity: MainActivity)

   /* @Subcomponent.Builder
    interface Builder{
        fun build() : MainComponent

        @BindsInstance
        fun mainInstance(mainModule : MainModule) : Builder
    }*/
}