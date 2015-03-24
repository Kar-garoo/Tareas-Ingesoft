def palindromo = {list -> list.any{x -> x.toLowerCase().replaceAll(" ","") ==  x.toLowerCase().replaceAll(" ","").reverse()}}

println palindromo(["Añora la Roña","casa","perro"])

def telescopio = {n -> (1..n).collect{ ((1..it).collect { x -> String s=((1..x).collect{x}).join(" ,") })}}

println telescopio(4)


def clousures = {x,list,res =[] -> list.each{print(it.call(x)+" ")}println()}
def sum = {x-> x+2}
def res = {x-> x-2}
clousures(1,[sum,res])

def ascend = {list->list.every{x-> (x == x.sort())}}

println (ascend([[1,2,6,5,4],[7,6,5,4,3,2,1]]))