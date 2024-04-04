
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let nota1Input = document.getElementById('nota1')
let nota2Input = document.getElementById('nota2')

function calcular() {
    let nota1 = parseFloat(nota1Input.value)
    let nota2 = parseFloat(nota2Input.value)

    if (isNaN(nota1) || nota1 < 0 || nota1 > 10 || isNaN(nota2) || nota2 < 0 || nota2 > 10) {
        div.innerHTML = `
            A nota digitada é inválida
        `

        nota1Input.classList.add('borda-vermelha')
        nota2Input.classList.add('borda-vermelha')
    } else {

        let media = (nota1 + nota2) / 2
        limpaClasse()
        
        if (media >= 7) {
            div.innerHTML = `Média: ${media} - Aprovado` 
            div.classList.add('verde')
        } else if(media >= 5) {
            div.innerHTML = `Média: ${media} - Recuperação`
            div.classList.add('amarelo')
        } else {
            div.innerHTML = `Média: ${media} - Reprovado`
            div.classList.add('vermelho')
        }
    }

    limparForm()
}

function limparForm () {
    nota1Input.value = ""
    nota2Input.value = ""

    nota1Input.focus()
}

function limpaClasse () {
    div.classList.remove('vermelho')
    div.classList.remove('verde')
    div.classList.remove('amarelo')
}

btn.addEventListener('click', calcular)