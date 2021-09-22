package den.project.first_lesson_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

fun main(){
    val disscount = Disscount()
//    disscount.discription = "fasdgahafhafdndfhadfhad"
    print(disscount.title)
}