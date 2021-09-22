package den.project.first_lesson_android

sealed class DiscountType(val calculate: (Int) -> String) {

    data class FixAmount(val value: Int) : DiscountType({
        (it * value).toString()
    })

    data class RangeAmount(val startValue: Int, val endValue: Int) : DiscountType({
        ((startValue + endValue) / 2 * it).toString()
    })

    object NoAmount : DiscountType({
        "zero"
    })
}