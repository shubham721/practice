object Problem16 {

  def drop(i: Int, symbols: List[Symbol]):List[Symbol]={
    val temp=for ( j <- 1 to symbols.length if j%i !=0) yield symbols(j-1)
//    val temp1 = symbols.zipWithIndex.withFilter(x=>(x._2+1)%i!=0).map(x=>x._1)
//    print(temp1+"\n")
    temp.toList
  }

  def main(args: Array[String])={
    print(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)));
  }
}
