package sample.naresh.com.checkdagger

import dagger.Module
import dagger.Provides

/**
 * Created by nareshkumar.reddy on 1/12/2018.
 */
@Module
class MainModule(val mainView : IMainView) {

    @Provides
    @ActivityScope
    fun providePresenter(): MainPreseneter{

        return MainPreseneter(mainView);
    }
}