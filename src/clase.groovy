def pali = {list -> list.any{x -> x.toLowerCase().replaceAll(" ","") ==  x.toLowerCase().replaceAll(" ","").reverse()}}

println pali(["Añora la Roña",
              "La ruta natural","Acaso hubo buhos aca",
              "Se van sus nave"])

def tele = {n -> (1..n).collect{ (1..it).collect { x -> (1..x).collect{print x}}}}
s =  tele(4)

println()

def clousu = {x,list,res =[] -> list.each{print(it.call(x)+" ")}}


def sum = {x-> x+2}
def res = {x-> x-2}
clousu(1,[sum,res])


