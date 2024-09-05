const form = document.querySelector('form');

form.addEventListener('submit', function(e){
    e.preventDefault();

    const height = parseInt(document.querySelector('#height').value);
    const weight = parseInt(document.querySelector('#weight').value);
    let results = document.querySelector('#results');

    
    if(height === '' ||  height<0 || isNaN(height)) {
        results.innerHTML = `please give a valid height ${height}`;
    }
    else if(weight === '' ||  weight<0 || isNaN(weight)) {
        results.innerHTML = `please give a valid weight ${weight}`;
    }else{
        const bmi = (weight / ((height * height) / 10000)).toFixed(2);
        results.innerHTML = `your BMI is ${bmi}`
    }

    results.innerHTML = `<span>${bmi}</span>`;

    
});