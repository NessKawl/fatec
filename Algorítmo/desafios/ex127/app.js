let div = document.querySelector('#res')

function calcular () {
    div.innerHTML = ''
    for (let i = 1; i <= 100; i++) {
        if (i % 4 == 0) {
            div.innerHTML += `<span style="color: green;">PI</span> <br>`
        } else {
            div.innerHTML += `<span style="color: orange;">${i}</span> <br>`
        }
    }
}

calcular()