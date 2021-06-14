/*
 * Fetch a JSON array of messages from the server and randomly choose one to display
 */

async function getMessage() {
    const serverResponse = await fetch('/hello');
    const messages = await serverResponse.json();

    const container = document.getElementById('greeting-container');
    const message = messages[Math.floor(Math.random() * messages.length)];

    container.innerText = message;
}
