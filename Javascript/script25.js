function getFormValores() {

    let nombre = document.getElementsByName("nombre")[0].value
    let apellido = document.getElementsByName("apellido")[0].value
    window.alert(`${nombre} ${apellido}`)
}