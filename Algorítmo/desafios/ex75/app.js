
let btn = document.getElementById('btn')
let div = document.getElementById('res')
let n1Input = document.getElementById('n1')

function calcular() {
    let n1 = parseFloat(n1Input.value)
    let contador = n1

    div.innerHTML = ""

    while (n1 > 1) {
        
        n1--
        contador = n1 * contador 

        div.innerHTML =`
             ${contador}
        `


    }

}

function limparForm () {

}

btn.addEventListener('click', calcular)