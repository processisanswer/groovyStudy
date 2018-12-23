package com.spicoming

/**
 * Created by zheng gongming on 2018/12/23.
*/
/*
 names=["11","22","33"]
for(i in names){
    println i
}
for(i in 1..3){
    println i
}*/

/*3.upto(10){
    println it
}
12.downto(8,{
    println it
})*/
//带步长的
/*1.step(11,3,{
    println it
})*/
//swich 语句,任何对象都可以，而java不可以
/*String s='12'
switch(s){
    case '12':
        println 'a'
        break
    default:
        println 'default'
}*/
/*def count=new Random().nextInt(101)
println '得分'+count
switch (count){
    case 80..100:
        println 'A'
        break
    case 60..80:
        println '合格'
        break
    default:
        println '不合格'
}*/
//闭包
/*def closure={
    return ( 'hello')
}
//print(closure.class);
println closure.call()*/
//闭包参数
//def name ='zhangsan'

/*def closure={
    name->
    return "hello，${name}"
}
println closure('lisi');*/
//it 默认参数
/*c={it}
print(c('run'))*/

/*def closure={item->
    item+1}
println closure.call(8);*/

/*int x=5
int fab(int number){
    int result=1
    1.upto(number,{
        num->result*=num
            println 'num='+num
            println 'result='+result;
    })
    return result
}
 fab(x)*/
//times 闭包
/*int cal(int number){
    int result=0
    number.times {
        num->result+=num
            println 'num->'+num
            println 'result->'+result
    }
    return result
}
println cal(6)*/
3.times {
    println it
}
//字符串与闭包
/*def str="groovy123"
str.each {
    temp->println temp
}*/
/*def str="String"
println str.find {
    it.isNumber()
}*/


























