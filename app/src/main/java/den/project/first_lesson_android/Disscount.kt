package den.project.first_lesson_android

data class Disscount(
    var title: String = "",
    var discription: String = "",
    var amount: Int = 0,
    var url: String = ""
) {

    fun getMyTitle() = this.title.uppercase()

    fun setMyDiscription(value: String) = if (value.length <= 100) {
        this.discription = value
    } else {
        this.discription = value?.substring(0..100)
    }

    fun setMyMounth(value: Int) {
        this.amount = try {
            1 / value
        } catch (exeption: ArithmeticException) {
            -1
        }
    }

}


