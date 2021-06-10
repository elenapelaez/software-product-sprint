async function getMessage() {
    const response = await fetch('/hello');
    const textResponse = await response.text();

    const container = document.getElementById('greeting-container');
    container.innerText = textResponse;
}