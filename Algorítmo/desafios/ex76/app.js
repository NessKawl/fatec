
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')

function calcular() {
    let n1 = parseFloat(n1Input.value)

    div.innerHTML = ''

    // for (let i = 1; i <= 10; i++) {
    //    div.innerHTML += (i * n1) + " "
    // } 

    let i = 1

    while (i <= 10) {
        div.innerHTML += (i * n1) + " "
        i++
    }
}

function limparForm () {

}

btn.addEventListener('click', calcular)