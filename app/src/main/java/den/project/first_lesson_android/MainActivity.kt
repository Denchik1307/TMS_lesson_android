package den.project.first_lesson_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

fun main() {

    val discountCopy = Discount(
        "New discount",
        "discount for test",
        5,
        "https://pravodeneg.net/wp-content/uploads/2018/11/discounting.jpg",
        "https://pravodeneg.net/buhuchet/formula-normy-diskonta.html"
    )

    print(discountCopy)

}


