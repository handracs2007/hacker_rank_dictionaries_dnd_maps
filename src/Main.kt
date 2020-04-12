// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

fun main() {
    val numOfCases = readLine()!!.toInt()
    val phoneMap = mutableMapOf<String, String>()

    for (i in 0 until numOfCases) {
        val phoneData = readLine()!!
        val name = phoneData.split(" ")[0]
        val phone = phoneData.split(" ")[1]
        phoneMap[name] = phone
    }

    while (true) {
        val query = readLine()

        if (query == null)
            break
        else {
            if (phoneMap.containsKey(query))
                println("$query=${phoneMap[query]}")
            else
                println("Not found")
        }
    }
}