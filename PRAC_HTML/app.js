const outputBox = document.getElementById("output");

let currentOperand = "";
let previousOperand = "";
let operation = null;

function updateDisplay() {
    outputBox.textContent = currentOperand || "0";
}

function appendNumber(num) {
    if (currentOperand === "0") {
        currentOperand = String(num);
    } else {
        currentOperand += String(num);
    }
    updateDisplay();
}

function appendDecimal() {
    if (!currentOperand.includes('.')) {
        currentOperand = currentOperand === "" ? "0." : currentOperand + ".";
        updateDisplay();
    }
}

function chooseOperator(op) {
    if (currentOperand === "") return;
    if (previousOperand !== "") {
        calculate();
    }
    operation = op;
    previousOperand = currentOperand;
    currentOperand = "";
}

function calculate() {
    if (!operation || currentOperand === "" || previousOperand === "") return;

    const a = parseFloat(previousOperand);
    const b = parseFloat(currentOperand);
    let result = 0;

    switch (operation) {
        case '+':
            result = a + b;
            break;
        case '-':
            result = a - b;
            break;
        case '*':
            result = a * b;
            break;
        case '/':
            result = b === 0 ? 'Error' : a / b;
            break;
    }

    currentOperand = String(result);
    previousOperand = "";
    operation = null;
    updateDisplay();
}

function clearDisplay() {
    currentOperand = "";
    previousOperand = "";
    operation = null;
    updateDisplay();
}


for (let i = 0; i <= 9; i++) {
    document.getElementById(`btn${i}`).addEventListener("click", () => appendNumber(i));
}

document.getElementById("btndecimal").addEventListener("click", appendDecimal);

document.getElementById("btnplus").addEventListener("click", () => chooseOperator('+'));
document.getElementById("btnminus").addEventListener("click", () => chooseOperator('-'));
document.getElementById("btnmultiply").addEventListener("click", () => chooseOperator('*'));
document.getElementById("btndivide").addEventListener("click", () => chooseOperator('/'));
document.getElementById("btnequal").addEventListener("click", calculate);

clearDisplay();