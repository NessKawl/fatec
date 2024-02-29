
let contador = 0

while(contador < 3) {
    contador++
    console.log(contador, "Feliz Ano Novo!")
    document.getElementById(`msg${contador}`).innerHTML = `${contador} Feliz Ano Novo!`
}