document.getElementById('clock');
// document.querySelector('#clock');
//set interval - it can run a method in a given set of interval or time

setInterval(function(){
    let date = new Date();
    clock.innerHTML = date.toLocaleTimeString();
}, 1000);    //1000 = 1 second

