package sample

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession.

// mvn clean
// mvn install
// mvn package
// spark-submit --class sample.sparkMavenExample --master local[2] target/sample-1.0-SNAPSHOT.jar 100

object sparkMavenExample {
  def main (arg: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("sparkMavenExample").getOrCreate()
    val sc = spark.sparkContext

    import spark.implicits._

    val df = Seq(
      (8, "bat"),
      (64, "mouse"),
      (-27, "horse")
    ).toDF("number", "word")

    df.show()
  }
}
