const sendInput = document.querySelector("#send-input");
const receiveInput = document.querySelector("#receive-input");
const rateValue = document.querySelector("#rate").textContent;

function calculateOutput(input) {
    if(!validateInput(input)){
        return;
    }
    if(input === sendInput){
        receiveInput.value = (sendInput.value * rateValue).toFixed(2);
    } else if(parseFloat(rateValue) !== 0){
        sendInput.value = (receiveInput.value / rateValue).toFixed(2);
    }
}

function validateInput(input){
    if(!isInputValid(input)){
        input.classList.add("invalid");
        resetOtherInput(input);
        return false;
    }
    setInputsAsValid();
    return true;
}

function isInputValid(input){
    let inputValue = input.value;
    return !isNaN(inputValue) && !isNaN(parseFloat(inputValue)) && parseFloat(inputValue) >= 0;
}

function resetOtherInput(input){
    if(input === sendInput){
        receiveInput.value = '';
    } else {
        sendInput.value = '';
    }
}

function setInputsAsValid() {
    sendInput.classList.remove("invalid");
    receiveInput.classList.remove("invalid");
}
