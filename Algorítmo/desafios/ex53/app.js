
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let numInput = document.getElementById('num')

function calcular() {
    
    let num = numInput.value

    if (num % 2 == 0) {
        div.innerHTML = `
            O número <span style="color: #37DE62;">${num}</span> é <span style="color: #37DE62;">PAR</span>
        `
    } else if (num % 2 == 1) {
        div.innerHTML = `
            O número <span style="color: red;">${num}</span> é <span style="color: red;">ÍMPAR</span>
        `
    }
}

function limparForm () {

}

btn.addEventListener('click', calcular)