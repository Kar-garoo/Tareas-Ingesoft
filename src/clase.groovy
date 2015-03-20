def pali = {list -> list.any{x -> x.toLowerCase().replaceAll(" ","") ==  x.toLowerCase().replaceAll(" ","").reverse()}}
/*
println pali(["Añora la Roña",
              "La ruta natural","Acaso hubo buhos aca",
              "Se van sus naves"])

*/

def tele = {n -> (1..n).collect{ x -> (1..x).each {print "$x"}}}

    s = tele(4)


def clousu = {x,list -> list.each{it.call(x)}}

clousu(["HOLA"],[pali])
