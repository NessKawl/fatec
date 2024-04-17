
let btn = document.getElementById('btn')
let div = document.getElementById('res')

function calcular() {
    for (let i = 1; i <= 50; i++) {

        if (i % 2 == 0) {
            div.innerHTML += ` 
                ${i} 
            `
        }  

    }
}

calcular()

function limparForm () {

}

// btn.addEventListener('click', calcular)