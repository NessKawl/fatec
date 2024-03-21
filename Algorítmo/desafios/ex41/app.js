
let btn = document.getElementById('btn')
let div = document.getElementById('res')
let raio1Input = document.getElementById('raio1')
let raio2Input = document.getElementById('raio2')

function calcular() {   
    let raio1 = parseFloat(raio1Input.value)
    let raio2 = parseFloat(raio2Input.value)
    
    let areaMaior = Math.PI * raio1 ** 2
    let areaMenor = Math.PI * raio2 ** 2
    let areaCoroa = areaMaior - areaMenor

    div.innerHTML = `
        A área da coroa é: ${areaCoroa}
    `

    limparForm()
}

function limparForm () {
    raio1Input.value = ''
    raio2Input.value = ''

    raio1Input.focus()
}

btn.addEventListener('click', calcular)