**Minimal example of spark using maven**

This project was built in **IntelliJ** using **Apache Spark/HDInsight** plugin. 

How to use: 

```shell
cd spark_maven
mvn clean
mvn install
mvn package
spark-submit --class sample.sparkMavenExample --master local[2] target/sample-1.0-SNAPSHOT.jar 100
```

