def EXA(numbers,value){
    operaciones = [:]
    println(numbers)
    for(i in numbers){
        for(j in numbers){
            if(numbers.indexOf(i) != numbers.indexOf(j)){
                //println(suma(i,j)+" $i,$j")
                if(suma(i,j,value)) {
                    operaciones << suma(i, j, value)
                }
                if (multi(i,j,value)) {
                    operaciones << multi(i, j, value)
                }
            }
        }
    }
    println(operaciones)
    l = []
    l = operaciones.keySet().asList()
    println(l.max())
    EXA(l,value)
}

println EXA([10, 5,25, 4, 78 ],291)

def suma(a,b,value){
    if(a+b<=value) {
        map = [:]
        map.put(a * b, "$a + $b")
        return map
    }
}
def multi(a,b,value){
    if(a*b <= value) {
        map = [:]
        map.put(a * b, "$a * $b")
        return map
    }
}