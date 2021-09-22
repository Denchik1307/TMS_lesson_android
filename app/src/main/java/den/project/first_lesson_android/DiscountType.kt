package den.project.first_lesson_android

enum class DiscountType {
    FixAmount,
    RangeAmount;

    override fun toString(): String {
        return when (this) {
            FixAmount -> "Fix"
            RangeAmount -> "Range"
        }
    }

}