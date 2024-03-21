let raioInput = document.getElementById('raio')
let btn = document.getElementById('btn')
let div = document.getElementById('res')

function calcular() {
    raio = parseFloat(raioInput.value) 

    let area = Math.PI * raio ** 2
    let perimetro = 2 * Math.PI * raio

    div.innerHTML = `
        A <strong>área</strong> da circunferência com raio ${raio} é ${area} e seu <strong>perímetro</strong> é ${perimetro}
    `

    limparForm()
}

function limparForm () {
    raioInput.value = ''
    raioInput.focus()
}

btn.addEventListener('click', calcular)