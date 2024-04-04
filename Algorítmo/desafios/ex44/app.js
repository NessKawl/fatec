
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let idadeIput = document.getElementById('idade')

function calcular() {
    let idade = idadeIput.value

    let idadeDias = idade * 365

    console.log(`Sua idade é ${idade}, ou seja ${idadeDias} dias!`);

    div.innerHTML = `
        Sua idade é ${idade}, ou seja ${idadeDias} <strong>dias</strong>!
    `

    limparForm()
}

function limparForm () {
    idadeIput.value = ""
    idadeIput.focus()
}

btn.addEventListener('click', calcular)