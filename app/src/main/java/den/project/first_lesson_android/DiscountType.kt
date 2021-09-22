package den.project.first_lesson_android

sealed class DiscountType() {

    data class FixAmount(val value: Int) : DiscountType()
    data class RangeAmount(val startValue: Int, val endValue: Int) : DiscountType()

    object NoAmount : DiscountType()

//    override fun toString(): String {
//        return when (this) {
//            FixAmount -> "Fix"
//            RangeAmount -> "Range"
//        }
//    }

}