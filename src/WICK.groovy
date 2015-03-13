libros = []
noKey = []
solucion = [:]

def wick(libro,solucion) {
    libro = libro.toLowerCase()
    array = libro.split()
    for (i = 0; i < array.length; i++) {

        if (!(array[i] in noKey)) {
            origin = array[i]
            array[i] = array[i].toUpperCase()
            pa = ""
            array.each {
                pa += it + " "
            }
            if(array[i] in solucion.keySet()){
                solucion.put(array[i]+"${solucion.size()*2}",pa.substring(0, pa.length() - 1))
            }else{
                solucion.put(array[i],pa.substring(0, pa.length() - 1))
            }

            array[i] = origin

        }
    }
}
//read = System.in.readLines() // PARA EL FINAL SE PUEDE USAR UN IDEONE
//para pruebas
read = [
        "using",
        "in",
        "the",
        "to",
        "::",
        "Introduction to algorithms",
        "The C programming language",
        "Natural Language processing",
        "Programming in Prolog",
        "Functional programming using Caml Light",
]

for (i in read){
    if(read.indexOf(i)<read.indexOf("::")){
        noKey.add(i)
    }
    if(read.indexOf(i)>read.indexOf("::")){
        libros.add(i)
    }
}
libros.each {

    wick(it,solucion)
}

solucion = solucion.sort{it.key}
//println(solucion.keySet())
solucion.each {
    println it.value
}
