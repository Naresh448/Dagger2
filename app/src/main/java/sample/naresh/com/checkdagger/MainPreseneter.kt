package sample.naresh.com.checkdagger

/**
 * Created by nareshkumar.reddy on 1/12/2018.
 */
class MainPreseneter(val mainView: IMainView) {

    fun callaMethod(){
        mainView.showSomething()
    }

}