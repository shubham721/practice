
def print(value: Int): Unit = {
  println(value)
  println(value + 1)
}

var a = 0
def inc(): Int = {
  a += 1
  a
}

print(inc())

val m = Map("a"->2, "b"->3)


val temp = 0.0
if(temp.equals(0.0))
  printf("hello")
else
  printf("not hello")


val getInt:Integer = 5
var avgFsnDeviation = {
  val  allListingsAvgMrp = 0.0

  val avgFsnMrp  = {
    if (allListingsAvgMrp.equals(0.0)){
      -1.0
    }
    else {
      allListingsAvgMrp
    }
  }
  (100.0 * (getInt - avgFsnMrp)) / avgFsnMrp
}

val map = Map("abc"-> 3.5)
def getAs[T](i: String): T = {
  map.get(i).get.asInstanceOf[T]
}
//getAs[Integer]("abc")
avgFsnDeviation

val donuts = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
donuts.mkString("#")

val keyColumn = "account_id,fsn"
val columnList: Array[String] = keyColumn.split(",")

//val tupleKey = columnList.tail.foldLeft(md5String(row.getAs[String](columnList.head)).substring(0,6) + "-" +
//  row.getAs[String](columnList.head))((result, element) => result+":"+row.getAs[String](element))
//valueColumn.split(separator).toList.map(value => rowSchema(tupleKey, value, row.getAs[AnyRef](value).toString))
//})

columnList.head
columnList.tail

val tupleKey = columnList.tail.foldLeft("abcdef"+"-"+"abcdefxyz")((result, element) => result+":"+"hulu")
tupleKey