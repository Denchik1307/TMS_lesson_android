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
    val disscount = Discount(
        "Cat",
        "The best Cat Discount",
        0, "https",
        DiscountType.FixAmount(1)
    )
    disscount.discountType = DiscountType.NoAmount
    println(disscount.discountType.calculate(5))
    disscount.discountType = DiscountType.RangeAmount(1, 5)
    println(disscount.discountType.calculate(5))
    disscount.discountType = DiscountType.FixAmount(2)
    println(disscount.discountType.calculate(5))

//    print(disscount00)

//    when (disscount.discountType) {
//        is DiscountType.FixAmount -> TODO()
//        DiscountType.NoAmount -> TODO()
//        is DiscountType.RangeAmount -> TODO()
//    }
}