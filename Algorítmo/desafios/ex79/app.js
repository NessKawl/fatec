
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')

let arrNotas = []



function calcular() {

    let n1 = parseFloat(n1Input.value)


    if (arrNotas.length < 5) {
        arrNotas.push(n1)
        div.innerHTML = ''

        // Mostra as notas na tela
        for (let i = 0; i < arrNotas.length; i++) {
            div.innerHTML += ' ' + arrNotas[i]
        }
            
    } else {
        //Ao chegar ao limite definido no if, o botão e o input são escondidos
        n1Input.classList.add('d-none')
        btn.classList.add('d-none')
    }

    // Soma todos os valores do array e divide pelo tamanho do array, que no caso é 5
    let media = (arrNotas[0] + arrNotas[1] + arrNotas[2] + arrNotas[3] + arrNotas[4]) / arrNotas.length

    // Mostra a média somente quando todas as notas forem digitadas
    if (arrNotas.length >= 5) {
        div.innerHTML += `
        <p>A média das notas é: ${media} </p>
        `        
    }
    
    limparForm()
}



function limparForm () {
    n1Input.value = ''
    n1Input.focus()
}

btn.addEventListener('click', calcular)