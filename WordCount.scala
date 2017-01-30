
//frequency of Words  in a file
import scala.io.Source
import scala.io._
import java.io._
object WordCount extends App{
val fileSource=Source.fromFile("/home/knoldus/Assignment27Jan/Input/inputFile")
val writer=new PrintWriter(new File("/home/knoldus/Assignment27Jan/output/count"))
val resMap=fileSource.getLines.flatMap(_.split("\\W+")).foldLeft(Map.empty[String, Int]){
     (count, word) =>count + (word -> (count.getOrElse(word, 0) + 1))
  }
for(ls<-resMap.toList){
writer.write(ls._1+"==>"+ls._2+"\n")

}
writer.close
}


