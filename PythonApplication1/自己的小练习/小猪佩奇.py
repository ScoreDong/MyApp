# coding:utf-8
import turtle as t #导入turtle
def 小猪佩奇(t=t):    
    t.pensize(6) # 设置画笔的大小
    t.colormode(255) # 设置GBK颜色范围为0-255
    t.color((255,155,192),"pink") # 设置画笔颜色和填充颜色(pink)
    t.setup(840,500) # 设置主窗口的大小为840*500
    t.speed(10) # 设置画笔速度为10
    #鼻子
    t.pu() # 提笔
    t.goto(-100,100) # 画笔前往坐标(-100,100)
    t.pd() # 下笔
    t.seth(-30) # 笔的角度为-30°
    t.begin_fill() # 外形填充的开始标志
    a=0.4
    for i in range(120):
        if 0<=i<30 or 60<=i<90:
            a=a+0.08
            t.lt(3) #向左转3度
            t.fd(a) #向前走a的步长
        else:
            a=a-0.08
            t.lt(3)
            t.fd(a)
    t.end_fill() # 依据轮廓填充
    t.pu() # 提笔
    t.seth(90) # 笔的角度为90度
    t.fd(25) # 向前移动25
    t.seth(0) # 转换画笔的角度为0
    t.fd(10)
    t.pd()
    t.pencolor(255,155,192) # 设置画笔颜色
    t.seth(10)
    t.begin_fill()
    t.circle(5) # 画一个半径为5的圆
    t.color(160,82,45) # 设置画笔和填充颜色
    t.end_fill()
    t.pu()
    t.seth(0)
    t.fd(20)
    t.pd()
    t.pencolor(255,155,192)
    t.seth(10)
    t.begin_fill()
    t.circle(5)
    t.color(160,82,45)
    t.end_fill()
    #头
    t.color((255,155,192),"pink")
    t.pu()
    t.seth(90)
    t.fd(41)
    t.seth(0)
    t.fd(0)
    t.pd()
    t.begin_fill()
    t.seth(180)
    t.circle(300,-30) # 顺时针画一个半径为300,圆心角为30°的园
    t.circle(100,-60)
    t.circle(80,-100)
    t.circle(150,-20)
    t.circle(60,-95)
    t.seth(161)
    t.circle(-300,15)
    t.pu()
    t.goto(-100,100)
    t.pd()
    t.seth(-30)
    a=0.4
    for i in range(60):
        if 0<=i<30 or 60<=i<90:
            a=a+0.08
            t.lt(3) #向左转3度
            t.fd(a) #向前走a的步长
        else:
            a=a-0.08
            t.lt(3)
            t.fd(a)
    t.end_fill()
    #耳朵
    t.color((255,155,192),"pink")
    t.pu()
    t.seth(90)
    t.fd(-7)
    t.seth(0)
    t.fd(70)
    t.pd()
    t.begin_fill()
    t.seth(100)
    t.circle(-50,50)
    t.circle(-10,120)
    t.circle(-50,54)
    t.end_fill()
    t.pu()
    t.seth(90)
    t.fd(-12)
    t.seth(0)
    t.fd(30)
    t.pd()
    t.begin_fill()
    t.seth(100)
    t.circle(-50,50)
    t.circle(-10,120)
    t.circle(-50,56)
    t.end_fill()
    #眼睛
    t.color((255,155,192),"white")
    t.pu()
    t.seth(90)
    t.fd(-20)
    t.seth(0)
    t.fd(-95)
    t.pd()
    t.begin_fill()
    t.circle(15)
    t.end_fill()
    t.color("black")
    t.pu()
    t.seth(90)
    t.fd(12)
    t.seth(0)
    t.fd(-3)
    t.pd()
    t.begin_fill()
    t.circle(3)
    t.end_fill()
    t.color((255,155,192),"white")
    t.pu()
    t.seth(90)
    t.fd(-25)
    t.seth(0)
    t.fd(40)
    t.pd()
    t.begin_fill()
    t.circle(15)
    t.end_fill()
    t.color("black")
    t.pu()
    t.seth(90)
    t.fd(12)
    t.seth(0)
    t.fd(-3)
    t.pd()
    t.begin_fill()
    t.circle(3)
    t.end_fill()
    #腮
    t.color((255,155,192))
    t.pu()
    t.seth(90)
    t.fd(-95)
    t.seth(0)
    t.fd(65)
    t.pd()
    t.begin_fill()
    t.circle(30)
    t.end_fill()
    #嘴
    t.color(239,69,19)
    t.pu()
    t.seth(90)
    t.fd(15)
    t.seth(0)
    t.fd(-100)
    t.pd()
    t.seth(-80)
    t.circle(30,40)
    t.circle(40,80)
    #身体
    t.color("red",(255,99,71))
    t.pu()
    t.seth(90)
    t.fd(-20)
    t.seth(0)
    t.fd(-78)
    t.pd()
    t.begin_fill()
    t.seth(-130)
    t.circle(100,10)
    t.circle(300,30)
    t.seth(0)
    t.fd(230)
    t.seth(90)
    t.circle(300,30)
    t.circle(100,3)
    t.color((255,155,192),(255,100,100))
    t.seth(-135)
    t.circle(-80,63)
    t.circle(-150,24)
    t.end_fill()
    #手
    t.color((255,155,192))
    t.pu()
    t.seth(90)
    t.fd(-40)
    t.seth(0)
    t.fd(-27)
    t.pd()
    t.seth(-160)
    t.circle(300,15)
    t.pu()
    t.seth(90)
    t.fd(15)
    t.seth(0)
    t.fd(0)
    t.pd()
    t.seth(-10)
    t.circle(-20,90)
    t.pu()
    t.seth(90)
    t.fd(30)
    t.seth(0)
    t.fd(237)
    t.pd()
    t.seth(-20)
    t.circle(-300,15)
    t.pu()
    t.seth(90)
    t.fd(20)
    t.seth(0)
    t.fd(0)
    t.pd()
    t.seth(-170)
    t.circle(20,90)
    #脚
    t.pensize(10)
    t.color((240,128,128))
    t.pu()
    t.seth(90)
    t.fd(-75)
    t.seth(0)
    t.fd(-180)
    t.pd()
    t.seth(-90)
    t.fd(40)
    t.seth(-180)
    t.color("black")
    t.pensize(15)
    t.fd(20)
    t.pensize(10)
    t.color((240,128,128))
    t.pu()
    t.seth(90)
    t.fd(40)
    t.seth(0)
    t.fd(90)
    t.pd()
    t.seth(-90)
    t.fd(40)
    t.seth(-180)
    t.color("black")
    t.pensize(15)
    t.fd(20)
    #尾巴
    t.pensize(4)
    t.color((255,155,192))
    t.pu()
    t.seth(90)
    t.fd(70)
    t.seth(0)
    t.fd(95)
    t.pd()
    t.seth(0)
    t.circle(70,20)
    t.circle(10,330)
    t.circle(70,30)

def 太阳花(t=t):
    t.color("red", "yellow")
    t.speed(10)
    t.begin_fill()
    for _ in range(50):
        t.forward(200)
        t.left(170)
    t.end_fill()

def 小蟒蛇惨不忍睹(t=t,rad=1500, angle=1400, len=0, neckrad=0):
    for _ in range(len):
        t.circle(rad, angle)
        t.circle(-rad, angle)
    t.circle(rad, angle/2)
    t.forward(rad/2)  # 直线前进
    t.circle(neckrad, 180)
    t.forward(rad/4)

def 五角星(t=t):
    t.pensize(5)
    t.pencolor("yellow")
    t.fillcolor("red")    
    t.begin_fill()
    for _ in range(5):
        t.forward(200)
        t.right(144)
    t.end_fill()
    t.penup()
    t.goto(-150,-120)
    t.color("violet")
    t.write("Done", font=('Arial', 40, 'normal'))

def 简单的五角星(t=t):
    for _ in range(5):
        t.fd(40)
        t.rt(144)

# 奇数N角星代码：
def 奇数N角星(t=t,n=5):
    for _ in range(n): 
        t.forward(100)# 画直线（长度100）
        t.right(180-180/n) # 右转

#偶数ｎ角星的画法
def 偶数N角星(t=t,n=6):
    import math
    n1 =int( n / 2 )# n的一半
    a = (180 * (n - 2) / n) # 正n边形内角
    b = 180 - a # n角形的内角
    c = b / 2 # 长方形短边与ｌ围城三角形的短边的对角
    d = 180 - (c * (n / 2 - 1))
    d1 = (d / 180) * math.pi
    c1 = (c / 180) * math.pi
    e = (math.sin(c1) / math.sin(d1)) * 100
    for _ in range(n1):
        t.forward(100)
        t.left(90)
        t.penup()
        t.forward(e)
        t.pendown()
        t.left(90)
        t.forward(100)
        t.left(180 - 180 / n1)

def N角星(t=t,n=5):
    if n % 2 == 1: #如果角除以2余数是1（如果是奇数N角星）
        奇数N角星(t=t,n=n) #那么，用奇数N角星的函数来画
    else: # 否则的话
        偶数N角星(t=t,n=n) #用偶数N角星的函数来画


def 简单的长方形(t=t):
    t.width(4) # 设置笔刷宽度
    t.forward(200) # 前进
    t.right(90) # 右转90度
    t.pencolor('red') # 换个颜色（换成红色）
    t.forward(100) # 前进
    t.right(90) # 右转90度
    t.pencolor('green')# 换个颜色（换成绿色）
    t.forward(200)
    t.right(90)
    t.pencolor('blue')# 换个颜色（换成蓝色）
    t.forward(100)
    t.right(90)


if __name__=="__main__":
    while True: 
        import time
        time.sleep( 5 )
        t.clear()
        小猪佩奇(t)
