// Adding interactive functionality
document.getElementById('welcome-btn').addEventListener('click', function() {
    alert('Welcome to my portfolio! Feel free to explore!');
});

// Contact form submission functionality
document.getElementById('contact-form').addEventListener('submit', function(event) {
    event.preventDefault();  // Prevent form submission

    // Simple validation
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    if (name && email && message) {
        document.getElementById('form-message').innerText = 'Thank you for your message!';
    } else {
        document.getElementById('form-message').innerText = 'Please fill in all fields.';
    }

    // Reset form
    event.target.reset();
});