//To capitalize the content of one file and copy it to another new file with same name in Different directory

import scala.io._
import scala.io.Source
import java.io._
object Capitalize extends App{
val fileSource="/home/knoldus/Assignment27Jan/Input/inputFile"
val parts=fileSource.split("/")
val writer = new PrintWriter(new File("/home/knoldus/Assignment27Jan/output/"+parts(parts.length-1)))
for(ls<-Source.fromFile(fileSource)){
writer.write(ls.toUpper)
}
writer.close
}
