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
    val disscount = Discount("Cat", "The best Cat Discount", 0, "https", DiscountType.FixAmount)
//    disscount.discription = "fasdgahafhafdndfhadfhad"
    disscount.discountType = DiscountType.RangeAmount
    print(disscount)
}