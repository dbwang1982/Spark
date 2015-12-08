
android create uitest-project -n 01_MTBF_PRC_Spark -t 7 -p E:\adt-bundle-windows-x86_64\workspace\01_MTBF_PRC_Spark
adb push ./bin/01_MTBF_PRC_Spark.jar /data/local/tmp/
adb shell uiautomator runtest 01_MTBF_PRC_Spark.jar -c com.mtbf.test.testcases.TestCase1
java -jar automator-log-converter-1.5.0.jar log.txt

aapt d badging todolist.apk