package den.project.first_lesson_android

sealed class OrderType(val delivery: (Order) -> String) {

//    data class FixAmount(val value: Int) : OrderType({
//        (it * value).toString()
//    })
//
//    data class RangeAmount(val startValue: Int, val endValue: Int) : OrderType({
//        ((startValue + endValue) / 2 * it).toString()
//    })
//
//    object NoAmount : OrderType({
//        "zero"
//    })
}