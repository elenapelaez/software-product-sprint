/*
 * Fetch a JSON array of emails from the server
 */
async function getMessage() {
    const serverResponse = await fetch('/submit-email');
    const messages = await serverResponse.json();

    const container = document.getElementById('email-responses');

    container.innerText = messages;
}

/**
 * gets the JSON array of submitted emails from the server
 */
function loadEmails() {
  fetch('/submit-email').then(response => response.json()).then((emails) => {
    const emailListElement = document.getElementById('email-responses');
    emails.forEach((email) => {
      emailListElement.appendChild(createEmailElement(email));
    })
  });
}

/**
 * prints an email to the HTML page in a list
 * @param email an element containing info about a user's email
 */
function createEmailElement(email) {
  const emailElement = document.createElement('li');
  const titleElement = document.createElement('span');
  titleElement.innerText = email.title;

  emailElement.appendChild(titleElement);

  return taskElement;
}
