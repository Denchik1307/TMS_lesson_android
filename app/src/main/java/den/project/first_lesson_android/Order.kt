package den.project.first_lesson_android

class Order(
    private var address: String,
    private var percentage: Int
) {

    fun getUppercaseTitle() = address.uppercase()

    fun setNewPercentage(description: Int) {
        percentage *= description
    }
}