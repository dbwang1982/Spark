#_*_coding:UTF-8_*_

"""
另外windows下的斜线（\）要用双斜线(\\)
Author:    wangzhiwen
"""
import sys
import re
import os
import time
#import whereutils

casename = "TestCase1"
packagename = "com.mtbf.test.testcases"
jarname = "01_MTBF_PRC_Spark"
workspace = "E:\\adt-bundle-windows-x86_64\\workspace\\01_MTBF_PRC_Spark"
#Throw the command "Android list" for ID
ID = "7"

dirname, filename = os.path.split(os.path.abspath(sys.argv[0]))
print "running from", dirname
print "file is:", filename
print "script: sys.argv[0] is", repr(sys.argv[0])
print "script: __file__ is", repr(__file__)
print "script: cwd is", repr(os.getcwd())


print "-----start uiautomator debug-----"
print "Create build.xml file"
#创建build文件:    android create uitest-project -n <name> -t 1 -p <path> 
os.system("android create uitest-project -n "+jarname+" -t "+ID+" -p "+"\""+workspace+"\"");


print "-Start modify the build.xml file-"
o=open(workspace+"\\build.xml","rb+")
d = ""
for s in o.readlines():
    a=s.replace("help","build")
    d+=a
o.seek(0)
o.truncate
o.write(d)
o.close()
print "----Modify the build.xml file is successfully--- "

#Ant build jar文件:    ant –buildfile <build.xml 文件路径>
print "---ANT BUILD---"
os.system("ant -buildfile "+"\""+workspace+"\\build.xml"+"\"")
#time.sleep(1)

#push文件:    adb push <path_to_output_jar> /data/local/tmp/     
print "---Push Files---"
os.system("adb push "+"\""+workspace+"\\bin\\"+jarname+".jar"+"\""+" /data/local/tmp/")
#time.sleep(1)

#运行测试:    adb shell uiautomator runtest test.jar -c <包名>.<类名>
print "---Run---"
#os.system("adb shell uiautomator runtest "+jarname+".jar"+" -c com.mtbf.test.testcases -e phone 100000")
os.system("adb shell uiautomator runtest "+jarname+".jar "+ "-c " + packagename+"."+casename)
print "---Finish debug---"

#Have any questions,please contact *****"