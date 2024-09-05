

function changeText() {
    let fpara = document.getElementById("para");
    fpara.textContent = "clicked";
    fpara.style.fontSize = "50px";
}

let fpara = document.getElementById("para");
fpara.addEventListener('click', changeText);

fpara.removeEventListener('click', changeText);