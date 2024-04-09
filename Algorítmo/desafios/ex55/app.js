
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let nomeInput = document.getElementById('nome')
let idadeInput = document.getElementById('idade')

function calcular() {
    let nome = nomeInput.value
    let idade = parseFloat(idadeInput.value)

    if (nome == "" || nome == typeof number || idade == "" || idade <= 0) {
        nomeInput.style.border = "1px solid red"
        idadeInput.style.border = "1px solid red"
    } else {
        div.innerHTML = `
            Nome: ${nome} <br>
            Idade: ${idade}
        `
    }

    limparForm()
}

function limparForm () {
    nomeInput.value = ""
    idadeInput.value = ""

    nomeInput.focus()
}

btn.addEventListener('click', calcular)