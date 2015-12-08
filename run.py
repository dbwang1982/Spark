import os
import fileinput



#便利读取testsuites.txt文件里的每一行信息
for line in fileinput.input("testsuites.txt"):
    #如果这一样的文本不为空
    if len(line.strip()) !=0:
        #拼接执行的语句，并把log输出到外部文件log.txt
        exeStr = "adb shell uiautomator runtest 01_MTBF_PRC_Spark.jar -c " 
        + line.strip() + " >>log.txt"
        #执行拼接完的语句
        os.system(exeStr);