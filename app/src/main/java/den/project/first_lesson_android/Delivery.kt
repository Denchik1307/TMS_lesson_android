package den.project.first_lesson_android

sealed class Delivery(val delivery: (Order) -> Unit) {

}

class WorkerOne(delivery: (Order) -> Unit) : Delivery({ print(delivery.toString()) }) {

}

class WorkerTwe(delivery: (Order) -> Unit) : Delivery({ print(delivery.toString()) }) {

}

class WorkerThree(delivery: (Order) -> Unit) : Delivery({ print(delivery.toString()) }) {

}

