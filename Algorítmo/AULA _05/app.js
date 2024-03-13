/*let btn = document.getElementById('btn')


function calcular() {
    console.log(btn)
    let x = 10
    console.log(x)
}

const calcular = function() {
    console.log(btn)
    let x = 10
    console.log(x)
}

const calcular = () => {
    console.log(btn)
    let x = 10
    console.log(x)
}

calcular()
*/

let btn = document.getElementById('btn')
let div = document.getElementById('res')
let nomeInput = document.getElementById('nome')

function calcular() {

    let nome = nomeInput.value

    div.innerHTML = `<p>NOME: ${nome}</p> `

    limparForm()
}

function limparForm () {
    nomeInput.value = ''
    nomeInput.focus()
}

btn.addEventListener('click', calcular)