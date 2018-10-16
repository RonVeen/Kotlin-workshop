//
//  Dit is een voorbeeld, geen idiomatic Kotlin code
//
fun SqlBuilder(fields: List<String>, table: String, clauses: List<String>) : String {

    val query: StringBuilder

    fun buildSelect() : String {
        val select = StringBuilder("SELECT ")
        fields.forEach { f -> select.append(f).append(' ') }
        return select.toString()
    }


    fun buildTable() = "FROM $table "

    fun buildClauses() : String {
        val where = StringBuilder("WHERE ")
        clauses.forEach { f -> where.append(f).append("") }
        return where.toString()
    }


    val sql = StringBuilder()
    sql.append(buildSelect())
    sql.append(buildTable())
    sql.append(buildClauses())

    return sql.toString()
}


fun main(args: Array<String>) {
    val sql = SqlBuilder(listOf("id, name"), "customer", listOf("status=A"))
    println(sql)
}

