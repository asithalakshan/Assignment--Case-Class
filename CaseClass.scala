object CaseClass {
   def main(args: Array[String]) {
      val p1 = point(2, 3)
      val p2 = point(3, 5)
     
      println(p1+p2)
      println(p1.move(5, 9))
      println(p1.distance(p2))
      println(p1.invert)
   }
}

case class point(a:Int, b:Int){
    def x:Int = a
    def y:Int = b
    
    
    def +(p:point) = point(this.x+p.x, this.y+p.y)
    def move(d1:Int, d2:Int) = point(this.x+d1, this.y+d2)
    def distance(p:point):Double = math.sqrt(math.pow((this.x-p.x), 2) + math.pow((this.y-p.y), 2))  
    def invert() = point(this.y, this.x)
}
