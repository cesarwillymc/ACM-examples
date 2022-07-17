import java.util.*

/**
 *
 * NameExercise
 *
 * @author Willy
 * Created 30/01/2022 at 11:58
 *
 */
/*
fun main(args: Array<String>) {
    val listValues = listOf(6, 5, 3, 1, 8, 7, 2, 4)
    var headSort: HeapSort? = null
    listValues.forEach {
        if (headSort == null)
            headSort = HeapSort(value = it)
        else
            headSort?.addValue(it)
    }
    print(headSort)
}

data class Three(
    var main: HeapSort? = null
) {
    fun addValue(value: Int) {
        if (main == null) {
            main = HeapSort(value)
        } else {
            main?.let { data ->
                addValue(data, value)
            }
        }
    }

    private fun addValue(heapSort: HeapSort, value: Int) {
        heapSort.apply {
            if (haveSpaceInChildren()) {
                if (left == null) {
                    left = HeapSort(value)
                } else {
                    right = HeapSort(value)
                }
            } else {
                this@Three?.addValue()
            }
        }
    }
}

data class HeapSort(
    var value: Int,
    var left: HeapSort? = null,
    var right: HeapSort? = null
) {
    fun haveChildren() = left != null || right != null
    fun haveCompleteValuesChildren() = left != null && right != null
    fun haveSpaceInChildren() = left == null || right == null
    fun isLeftGreaterThan() = (left?.value ?: 0) > (right?.value ?: 0)
}*/