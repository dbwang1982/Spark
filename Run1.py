import os
import fileinput
from Canvas import Line

#删除存在的log文件或报告文件，避免以前构建产生的数据对当前构建造成影响
if os.path.exists("log.txt"):
    os.remove("log.txt")  
if os.path.exists("log.xml"):
    os.remove("log.xml")
    
#编译生成jar
os.system("ant build")

#push jar 到设备
os.system("adb push bin/01_MTBF_PRC_Spark.jar /data/local/tmp")

#遍历读取testsuites.txt文件里的每一行信息
for line in fileinput.input("testsuites.txt"):
    #如果这一行的文本不为空
    if len(line.strip()) !=0:
        #拼接执行的语句，并把log输出到外部文件log.txt
        exeStr = "adb shell uiautomator runtest 01_MTBF_PRC_Spark.jar -c "
        + line.strip() + " >>log.txt"
        #执行拼接完的语句
        os.system(exeStr) 
#转化log文件为JUNIT报告
os.system("java -jar log-converter.jar log.txt")