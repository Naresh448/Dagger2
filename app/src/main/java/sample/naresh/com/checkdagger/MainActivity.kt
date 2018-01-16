package sample.naresh.com.checkdagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import javax.inject.Inject

class MainActivity : AppCompatActivity(), IMainView {


    @Inject
    lateinit var presenter : MainPreseneter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DemoApplication.applicationComponent?.plus(MainModule(this))?.inject(this)

        presenter.callaMethod()
    }

    override fun showSomething() {
        Toast.makeText(this,"Yahoo first dependency",Toast.LENGTH_LONG).show();
    }
}
