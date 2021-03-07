const sendInput = document.querySelector("#send-input");
const receiveInput = document.querySelector("#receive-input");
const rateValue = new BigNumber(document.querySelector("#rate").textContent);

function calculateOutput(input) {
    input.value = String(input.value).substring(0, 9);
    if(!validateInput(input)){
        return;
    }

    const sendInputValue = new BigNumber(sendInput.value);
    const receiveInputValue = new BigNumber(receiveInput.value);
    if(input === sendInput){
        receiveInput.value = sendInputValue.multipliedBy(rateValue).toFixed(4);
    } else if(!rateValue.isEqualTo(0)){
        sendInput.value = receiveInputValue.dividedBy(rateValue).toFixed(4);
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
