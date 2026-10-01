```javascript
// ========================================
// CHRISTY.S PORTFOLIO - JAVASCRIPT
// ========================================


// Show a welcome message when the page loads
window.addEventListener("load", function () {

    console.log("Welcome to Christy.S Portfolio!");

});


// ========================================
// SMOOTH NAVIGATION
// ========================================

const navLinks = document.querySelectorAll("nav a");

navLinks.forEach(function (link) {

    link.addEventListener("click", function (event) {

        event.preventDefault();

        const targetId = link.getAttribute("href");

        const targetSection = document.querySelector(targetId);

        if (targetSection) {

            targetSection.scrollIntoView({
                behavior: "smooth"
            });

        }

    });

});


// ========================================
// BUTTON INTERACTION
// ========================================

const exploreButton = document.querySelector(".btn");

if (exploreButton) {

    exploreButton.addEventListener("click", function () {

        console.log("Exploring Christy.S profile...");

    });

}


// ========================================
// CURRENT YEAR IN FOOTER
// ========================================

const footer = document.querySelector("footer");

if (footer) {

    const currentYear = new Date().getFullYear();

    footer.innerHTML =
        "<p>Made with ❤️ by Christy.S</p>" +
        "<p>© " + currentYear +
        " Christy.S | All Rights Reserved</p>";

}


// ========================================
// SKILL CARD CLICK EFFECT
// ========================================

const skills = document.querySelectorAll(".skill");

skills.forEach(function (skill) {

    skill.addEventListener("click", function () {

        skill.classList.toggle("active");

    });

});


// ========================================
// PROJECT CARD CLICK
// ========================================

const projects = document.querySelectorAll(".project");

projects.forEach(function (project) {

    project.addEventListener("click", function () {

        console.log("Project selected");

    });

});
```
