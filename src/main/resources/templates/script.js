function toggleTheme() {
    const body = document.body;
    const toggleIcon = document.getElementById('toggle-icon');
    
    body.classList.toggle('dark-mode');
    
    if (body.classList.contains('dark-mode')) {
        // Animate the switch toggle to dark mode
        toggleIcon.style.transform = 'translateX(25px)';
    } else {
        // Animate the switch toggle to light mode
        toggleIcon.style.transform = 'translateX(0px)';
    }
}
